// GPars - Groovy Parallel Systems
//
// Copyright © 2008-11  The original author or authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package groovyx.gpars.samples.activeobject

import groovyx.gpars.activeobject.ActiveObject
import groovyx.gpars.activeobject.ActiveMethod

@ActiveObject
class Foo {
    def foo() {
        println 'Foo'
    }

    @ActiveMethod
    def bar(int value) {
        println 'Bar ' + value
    }
}

final actor = new Foo().internalActiveObjectActor
println actor
new Foo().foo()
new Foo().activeObject_bar(10)
new Foo().bar(10)
new Foo().bar(20)

sleep 1000

class A {
    @ActiveMethod
    def foo() {

    }

}

@ActiveObject
class B extends A {

}