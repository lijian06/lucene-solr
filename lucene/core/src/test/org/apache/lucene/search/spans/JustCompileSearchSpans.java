package org.apache.lucene.search.spans;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.similarities.Similarity;

import java.io.IOException;

/**
 * Holds all implementations of classes in the o.a.l.s.spans package as a
 * back-compatibility test. It does not run any tests per-se, however if
 * someone adds a method to an interface or abstract method to an abstract
 * class, one of the implementations here will fail to compile and so we know
 * back-compat policy was violated.
 */
final class JustCompileSearchSpans {

  private static final String UNSUPPORTED_MSG = "unsupported: used for back-compat testing only !";

  static final class JustCompileSpans extends Spans {

    @Override
    public int docID() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public int nextDoc() throws IOException {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public int advance(int target) throws IOException {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }
    
    @Override
    public int startPosition() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public int endPosition() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public void collect(SpanCollector collector) throws IOException {

    }

    @Override
    public int nextStartPosition() throws IOException {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public long cost() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }
  }

  static final class JustCompileSpanQuery extends SpanQuery {

    @Override
    public String getField() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public SpanWeight createWeight(IndexSearcher searcher, boolean needsScores, SpanCollectorFactory factory) throws IOException {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public String toString(String field) {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }
    
  }

  static final class JustCompilePayloadSpans extends Spans {

    @Override
    public int docID() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public int nextDoc() throws IOException {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public int advance(int target) throws IOException {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public int startPosition() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public int endPosition() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public void collect(SpanCollector collector) throws IOException {

    }

    @Override
    public int nextStartPosition() throws IOException {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    public long cost() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }
    
  }
  
  static final class JustCompileSpanScorer extends SpanScorer {

    protected JustCompileSpanScorer(Spans spans, SpanWeight weight,
        Similarity.SimScorer docScorer) throws IOException {
      super(spans, weight, docScorer);
    }

    @Override
    protected void setFreqCurrentDoc() {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }

    @Override
    protected float scoreCurrentDoc() throws IOException {
      throw new UnsupportedOperationException(UNSUPPORTED_MSG);
    }
  }
}
