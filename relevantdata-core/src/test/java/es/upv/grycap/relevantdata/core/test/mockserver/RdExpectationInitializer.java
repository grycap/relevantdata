/*
 * Relevant Data - Core Components.
 * Copyright 2015-2016 GRyCAP (Universitat Politecnica de Valencia)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * This product combines work with different licenses. See the "NOTICE" text
 * file for details on the various modules and licenses.
 * 
 * The "NOTICE" text file is part of the distribution. Any derivative works
 * that you distribute must include a readable copy of the "NOTICE" text file.
 */

package es.upv.grycap.relevantdata.core.test.mockserver;

import org.mockserver.client.server.MockServerClient;
import org.mockserver.initialize.ExpectationInitializer;

/**
 * Sets Mock Server expectations for tests that requires a valid HTTP/Proxy server to interact with.
 * @author Erik Torres <etserrano@gmail.com>
 * @since 0.0.1
 */
public class RdExpectationInitializer implements ExpectationInitializer {

	public static final String MOCK_SERVER_BASE_URL = "http://localhost:9080";

	@Override
	public void initializeExpectations(final MockServerClient client) {
		// TODO
	}
	
}