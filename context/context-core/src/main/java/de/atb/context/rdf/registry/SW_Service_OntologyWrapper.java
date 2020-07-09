package de.atb.context.rdf.registry;

/*-
 * #%L
 * ATB Context Extraction Core Lib
 * %%
 * Copyright (C) 2016 - 2020 ATB
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import org.protege.owl.codegeneration.WrappedIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Collection;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: SW_Service_OntologyWrapper <br>
 * @version generated on Mon Oct 05 21:07:01 BST 2015 by Giovanni
 */

public interface SW_Service_OntologyWrapper extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#hasSWService_Configuration
     */
     
    /**
     * Gets all property values for the hasSWService_Configuration property.<p>
     * 
     * @return a collection of values for the hasSWService_Configuration property.
     */
    Collection<? extends SW_Service_Configuration_OntologyWrapper> getHasSWServiceConfiguration();

    /**
     * Checks if the class has a hasSWService_Configuration property value.<p>
     * 
     * @return true if there is a hasSWService_Configuration property value.
     */
    boolean hasHasSWServiceConfiguration();

    /**
     * Adds a hasSWService_Configuration property value.<p>
     * 
     * @param newHasSWServiceConfiguration the hasSWService_Configuration property value to be added
     */
    void addHasSWServiceConfiguration(SW_Service_Configuration_OntologyWrapper newHasSWServiceConfiguration);

    /**
     * Removes a hasSWService_Configuration property value.<p>
     * 
     * @param oldHasSWServiceConfiguration the hasSWService_Configuration property value to be removed.
     */
    void removeHasSWServiceConfiguration(SW_Service_Configuration_OntologyWrapper oldHasSWServiceConfiguration);


    /* ***************************************************
     * Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#hasSWService_Deployer
     */
     
    /**
     * Gets all property values for the hasSWService_Deployer property.<p>
     * 
     * @return a collection of values for the hasSWService_Deployer property.
     */
    Collection<? extends Deployer_OntologyWrapper> getHasSWServiceDeployer();

    /**
     * Checks if the class has a hasSWService_Deployer property value.<p>
     * 
     * @return true if there is a hasSWService_Deployer property value.
     */
    boolean hasHasSWServiceDeployer();

    /**
     * Adds a hasSWService_Deployer property value.<p>
     * 
     * @param newHasSWServiceDeployer the hasSWService_Deployer property value to be added
     */
    void addHasSWServiceDeployer(Deployer_OntologyWrapper newHasSWServiceDeployer);

    /**
     * Removes a hasSWService_Deployer property value.<p>
     * 
     * @param oldHasSWServiceDeployer the hasSWService_Deployer property value to be removed.
     */
    void removeHasSWServiceDeployer(Deployer_OntologyWrapper oldHasSWServiceDeployer);


    /* ***************************************************
     * Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#IdName
     */
     
    /**
     * Gets all property values for the IdName property.<p>
     * 
     * @return a collection of values for the IdName property.
     */
    Collection<? extends String> getIdName();

    /**
     * Checks if the class has a IdName property value.<p>
     * 
     * @return true if there is a IdName property value.
     */
    boolean hasIdName();

    /**
     * Adds a IdName property value.<p>
     * 
     * @param newIdName the IdName property value to be added
     */
    void addIdName(String newIdName);

    /**
     * Removes a IdName property value.<p>
     * 
     * @param oldIdName the IdName property value to be removed.
     */
    void removeIdName(String oldIdName);



    /* ***************************************************
     * Property http://www.semanticweb.org/giovanni/ontologies/2014/10/untitled-ontology-55#status
     */
     
    /**
     * Gets all property values for the status property.<p>
     * 
     * @return a collection of values for the status property.
     */
    Collection<? extends String> getStatus();

    /**
     * Checks if the class has a status property value.<p>
     * 
     * @return true if there is a status property value.
     */
    boolean hasStatus();

    /**
     * Adds a status property value.<p>
     * 
     * @param newStatus the status property value to be added
     */
    void addStatus(String newStatus);

    /**
     * Removes a status property value.<p>
     * 
     * @param oldStatus the status property value to be removed.
     */
    void removeStatus(String oldStatus);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
