package de.atb.context.monitoring.parser.messagebroker;

/*
 * #%L
 * ATB Context Monitoring Core Services
 * %%
 * Copyright (C) 2015 - 2021 ATB
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

import de.atb.context.monitoring.analyser.IndexingAnalyser;
import de.atb.context.monitoring.config.models.DataSource;
import de.atb.context.monitoring.config.models.InterpreterConfiguration;
import de.atb.context.monitoring.index.Indexer;
import de.atb.context.monitoring.models.IMessageBroker;
import de.atb.context.monitoring.models.IMonitoringDataModel;
import de.atb.context.monitoring.parser.IndexedFields;
import de.atb.context.monitoring.parser.IndexingParser;
import de.atb.context.tools.ontology.AmIMonitoringConfiguration;
import org.apache.lucene.document.DateTools;
import org.apache.lucene.document.Document;

import java.util.Date;


/**
 * WebServiceParser
 * 
 * @author scholze
 * @version $LastChangedRevision: 143 $
 * 
 */
public abstract class MessageBrokerParser extends IndexingParser<IMessageBroker> {

	protected IndexingAnalyser<? extends IMonitoringDataModel<?, ?>, IMessageBroker> serviceAnalyser;

	public MessageBrokerParser(final DataSource dataSource,
                               final InterpreterConfiguration interpreterConfiguration,
                               final Indexer indexer, final AmIMonitoringConfiguration amiConfiguration) {
		super(dataSource, interpreterConfiguration, indexer, amiConfiguration);
		this.serviceAnalyser = this.interpreterConfiguration.createAnalyser(
				dataSource, indexer, this.document, amiConfiguration);
	}

	@Override
	public final synchronized boolean parse(final IMessageBroker object) {
		// some generic webservice handling stuff could be done here
		// like indexing webservice status, modification etc.

		this.document.add(IndexedFields.createField(IndexedMessageBrokerFields.Uri,
				String.valueOf(object.getURI())));
		this.document.add(IndexedFields.createField(IndexedFields.MonitoredAt,
				DateTools.timeToString(new Date().getTime(),
						DateTools.Resolution.SECOND)));

		// TODO add some webserivce-specific fields to the document's index
		return parseObject(object, this.document);
	}

	@Override
	public final synchronized IndexingAnalyser<? extends IMonitoringDataModel<?, ?>, IMessageBroker> getAnalyser() {
		return this.serviceAnalyser;
	}

	/**
	 * Abstract method to be implemented by the webservice specific parser.
	 * 
	 * @param service
	 *            the actual webservice to parsed.
	 * @param document
	 *            the document to add indexed fields to.
	 * @return <code>true</code> if parsing was successful, <code>false</code>
	 *         otherwise.
	 */
	protected abstract boolean parseObject(IMessageBroker service,
			Document document);

}