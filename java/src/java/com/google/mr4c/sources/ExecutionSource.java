/**
  * Copyright 2014 Google Inc. All rights reserved.
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
*/

package com.google.mr4c.sources;

import com.google.mr4c.algorithm.Algorithm;
import com.google.mr4c.config.algorithm.AlgorithmConfig;
import com.google.mr4c.algorithm.AlgorithmEnvironment;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public interface ExecutionSource {

	AlgorithmConfig getAlgorithmConfig();

	Algorithm getAlgorithm( AlgorithmEnvironment env ) throws IOException;

	Algorithm getAlgorithm() throws IOException;

	DatasetSource getInputDatasetSource(String name) throws IOException;

	Set<String> getInputDatasetNames();
	
	DatasetSource getOutputDatasetSource(String name) throws IOException;

	Set<String> getOutputDatasetNames();

	Set<String> getOutputDatasetNames(DatasetSource.SourceType type);

	Properties getConfigParams();	

}

