/**
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

package org.seaborne.dboe.transaction;

import org.seaborne.dboe.transaction.txn.TransactionalBase ;
import org.seaborne.dboe.transaction.txn.journal.Journal ;

/** 
 * A Transactional (unit of begin/commit) of a single integer component (a {@link TransInteger}).
 */
public class TransactionalInteger extends TransactionalBase {
    final private TransInteger integer ;

    public TransactionalInteger(Journal journal) {
        this(journal, 0L) ;
    }

    public TransactionalInteger(Journal journal, long v) {
        super(journal) ;
        integer = new TransInteger(v) ;
        super.txnMgr.add(integer) ;
    }

    public void inc() {
        integer.inc() ;
    }

    /** Return the current value.
     * If inside a transaction, return the tarnsaction view of the value.
     * If not in a transaction return the state value (effectively
     * a fast read transaction).   
     */
    public long get() {
        return integer.get() ;
    }
    
    public void set(long v) {
        integer.set(v) ;
    }
    
    /** Return the currently commited value */ 
    public long value() {
        return integer.value() ;
    }
}
