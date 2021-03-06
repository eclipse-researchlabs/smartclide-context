/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.atb.context.rdf.manager;

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


import de.atb.context.infrastructure.Node;
import de.atb.context.infrastructure.ServiceInfo;
import de.atb.context.modules.broker.status.ontology.StatusVocabulary;

import java.util.List;

/**
 * @author Giovanni
 */
public interface IServiceRegistryRepository {

    void initializeRepository();

    boolean insert(Node node);

    boolean delete(Node node);

    Node selectForId(String id);

    List<ServiceInfo> selectForServiceType(String typeID);

    List<Node> selectAllConnectedDeployers();

    boolean updateStatus(List<String> id, StatusVocabulary status);

    List<ServiceInfo> selectForFreeServiceByType(String typeID);

    boolean updateSingleStatusById(String id, StatusVocabulary status);

    boolean setStatusByIds(List<String> id, StatusVocabulary status);

    boolean updateSingleStatusByLocation(String location, StatusVocabulary status);
}
