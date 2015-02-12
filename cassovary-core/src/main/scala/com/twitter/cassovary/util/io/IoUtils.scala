/*
 * Copyright 2015 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.twitter.cassovary.util.io

import java.io.File

object IoUtils {

  def readFiles(directory: String, prefixFileNames: String): Array[String] = {
    val dir = new File(directory)
    val filesInDir = dir.list()
    if (filesInDir == null) {
      throw new Exception("Current directory is " + System.getProperty("user.dir") +
        " and nothing was found in dir " + dir)
    }
    filesInDir.filter(_.startsWith(prefixFileNames)).map(directory + "/" + _)
  }
}