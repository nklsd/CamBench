/*
 * Copyright 2022-2023 The CamBench Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package main.java.org.cambench.cap.patterns.mixed.interprocedural2;

import main.java.org.cambench.cap.patterns.pure.FieldSensitivity;

public class Inter2Field {
    public void main(String[] args) {
        Class1 classObject = new Class1();
        classObject.value1 = "secret value";
        classObject.value2 = "non secret value";

        System.out.println(classObject.value2);
        method(classObject.value1);
    }

    public static void method(String str){
        System.out.println(str);
    }
    public class Class1 {
        String value1;
        String value2;
    }
}

