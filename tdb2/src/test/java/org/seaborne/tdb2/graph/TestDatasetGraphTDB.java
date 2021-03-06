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

package org.seaborne.tdb2.graph;

import org.apache.jena.sparql.core.AbstractDatasetGraphTests ;
import org.apache.jena.sparql.core.DatasetGraph ;
import org.junit.Test ;
import org.seaborne.tdb2.junit.TL ;

// Quad tests
public class TestDatasetGraphTDB extends AbstractDatasetGraphTests
{
    @Override
    protected DatasetGraph emptyDataset() { return TL.createTestDatasetGraphMem() ; }

    @Override
    // Empty graph tests: N/A
    @Test public void graph_01()
    {}

}
