/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tinkerpop.machine.beam;

import org.apache.tinkerpop.machine.functions.BranchFunction;
import org.apache.tinkerpop.machine.traversers.Traverser;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class BranchFn<C, S, E> extends AbstractFn<C, S, E> {

    public BranchFn(final BranchFunction<C, S, E> branchFunction) {
        super(branchFunction);
    }

    @ProcessElement
    public void processElement(final @Element Traverser<C, S> traverser, final OutputReceiver<Traverser<C, E>> output) {
        throw new IllegalStateException("Branching is implemented using split/merge streams in Beam");
    }
}