package de.atb.context.monitoring.analyser.messagebroker;

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
import de.atb.context.tools.ontology.AmIMonitoringConfiguration;
import org.apache.lucene.document.Document;

import java.util.List;

/**
 * WebServiceAnalyser
 * 
 * @author scholze
 * @version $LastChangedRevision: 143 $
 * 
 */
public abstract class MessageBrokerAnalyser<OutputType extends IMonitoringDataModel<?, ?>> extends IndexingAnalyser<OutputType, String> {

	public MessageBrokerAnalyser() {
		super();
	}

	public MessageBrokerAnalyser(final DataSource dataSource, final InterpreterConfiguration interpreterConfiguration, final Indexer indexer, final Document document, final AmIMonitoringConfiguration amiConfiguration) {
		super(dataSource, interpreterConfiguration, indexer, document, amiConfiguration);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * IndexingAnalyser#analyseObject
	 * (java.lang.Object, org.apache.lucene.document.Document)
	 */
	@Override
	public final List<OutputType> analyseObject(final String service, final Document document) {
		// some generic handling stuff could be done here
		// like indexing file creation, modification etc.

		return analyseObject(service);
	}

	public abstract List<OutputType> analyseObject(String service);

}