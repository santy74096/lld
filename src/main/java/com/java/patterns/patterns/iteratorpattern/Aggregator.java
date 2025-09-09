package com.java.patterns.patterns.iteratorpattern;

import java.nio.file.DirectoryIteratorException;

public interface Aggregator {

    Iterator createItr();
}
