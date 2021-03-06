/*
 * Copyright (c) 2008-2011 Ivan Khalopik.
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

package com.example.junit3;

import junit.extensions.RepeatedTest;
import org.junit.Ignore;

/**
 * @author Ivan Khalopik
 * @since 1.0
 */
@Ignore
public class StringUtilsJUnit3RepeatedTest extends RepeatedTest {
	public StringUtilsJUnit3RepeatedTest() {
		super(new StringUtilsJUnit3Test(), 100);
	}
}
