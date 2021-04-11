package de.atb.context.rdf.registry.impl;

/*-
 * #%L
 * ATB Context Extraction Core Lib
 * %%
 * Copyright (C) 2020 ATB – Institut für angewandte Systemtechnik Bremen GmbH
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */


import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.semanticweb.owlapi.model.IRI;
import de.atb.context.rdf.registry.SW_Service_Configuration_OntologyWrapper;
import de.atb.context.rdf.registry.SW_Service_OntologyWrapper;
import de.atb.context.rdf.registry.Vocabulary;

import java.util.Collection;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultSW_Service_Configuration_OntologyWrapper <br>
 *
 * @version generated on Mon Oct 05 21:07:01 BST 2015 by Giovanni
 */
public class DefaultSW_Service_Configuration_OntologyWrapper extends WrappedIndividualImpl implements SW_Service_Configuration_OntologyWrapper {

    public DefaultSW_Service_Configuration_OntologyWrapper(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#hasConfiguration_SWService
     */

    public Collection<? extends SW_Service_OntologyWrapper> getHasConfigurationSWService() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASCONFIGURATION_SWSERVICE,
                DefaultSW_Service_OntologyWrapper.class);
    }

    public boolean hasHasConfigurationSWService() {
        return !getHasConfigurationSWService().isEmpty();
    }

    public void addHasConfigurationSWService(SW_Service_OntologyWrapper newHasConfigurationSWService) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASCONFIGURATION_SWSERVICE,
                newHasConfigurationSWService);
    }

    public void removeHasConfigurationSWService(SW_Service_OntologyWrapper oldHasConfigurationSWService) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                Vocabulary.OBJECT_PROPERTY_HASCONFIGURATION_SWSERVICE,
                oldHasConfigurationSWService);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#IdName
     */

    public Collection<? extends String> getIdName() {
        return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDNAME, String.class);
    }

    public boolean hasIdName() {
        return !getIdName().isEmpty();
    }

    public void addIdName(String newIdName) {
        getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDNAME, newIdName);
    }

    public void removeIdName(String oldIdName) {
        getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_IDNAME, oldIdName);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#host
     */

    public Collection<? extends String> getHost() {
        return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HOST, String.class);
    }

    public boolean hasHost() {
        return !getHost().isEmpty();
    }

    public void addHost(String newHost) {
        getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HOST, newHost);
    }

    public void removeHost(String oldHost) {
        getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HOST, oldHost);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#location
     */

    public Collection<? extends String> getLocation() {
        return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LOCATION, String.class);
    }

    public boolean hasLocation() {
        return !getLocation().isEmpty();
    }

    public void addLocation(String newLocation) {
        getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LOCATION, newLocation);
    }

    public void removeLocation(String oldLocation) {
        getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LOCATION, oldLocation);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#name
     */

    public Collection<? extends String> getName() {
        return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_NAME, String.class);
    }

    public boolean hasName() {
        return !getName().isEmpty();
    }

    public void addName(String newName) {
        getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_NAME, newName);
    }

    public void removeName(String oldName) {
        getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_NAME, oldName);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#proxy
     */

    public Collection<? extends String> getProxy() {
        return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PROXY, String.class);
    }

    public boolean hasProxy() {
        return !getProxy().isEmpty();
    }

    public void addProxy(String newProxy) {
        getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PROXY, newProxy);
    }

    public void removeProxy(String oldProxy) {
        getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PROXY, oldProxy);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#server
     */

    public Collection<? extends String> getServer() {
        return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SERVER, String.class);
    }

    public boolean hasServer() {
        return !getServer().isEmpty();
    }

    public void addServer(String newServer) {
        getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SERVER, newServer);
    }

    public void removeServer(String oldServer) {
        getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SERVER, oldServer);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#type
     */

    public Collection<? extends String> getType() {
        return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_TYPE, String.class);
    }

    public boolean hasType() {
        return !getType().isEmpty();
    }

    public void addType(String newType) {
        getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_TYPE, newType);
    }

    public void removeType(String oldType) {
        getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_TYPE, oldType);
    }


}
