/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  See the NOTICE file distributed with this work for additional
 *  information regarding copyright ownership.
 */

package org.seaborne.tdb2.store;

import org.apache.jena.graph.Graph ;
import org.apache.jena.graph.Node ;
import org.apache.jena.query.Dataset ;
import org.apache.jena.sparql.graph.AbstractTestGraph2 ;
import org.apache.jena.sparql.util.NodeFactoryExtra ;
import org.junit.After ;
import org.junit.Before ;
import org.seaborne.tdb2.junit.TL ;

/** Programmatic tests on persistent graph */
public class TestGraphNamedTDB extends AbstractTestGraph2
{
    static Node graphNode = NodeFactoryExtra.parseNode("<http://example/namedGraph>") ;
    private Dataset dataset ;
    private Graph   graph ;

    @Before
    public void before() {
        dataset = TL.createTestDatasetMem() ;
        graph = dataset.asDatasetGraph().getGraph(graphNode) ;
    }

    @After
    public void after() {
        TL.releaseDataset(dataset) ;
    }

    @Override
    protected Graph emptyGraph() {
        graph.clear() ;
        return graph ;
    }
    
    @Override
    protected void returnGraph(Graph g)
    {}
}
