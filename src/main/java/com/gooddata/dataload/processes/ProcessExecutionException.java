/*
 * Copyright (C) 2004-2017, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata.dataload.processes;

import com.gooddata.GoodDataException;

/**
 * Represents failure during process execution
 */
public class ProcessExecutionException extends GoodDataException {

    private ProcessExecutionDetail executionDetail;
    private String executionDetailUri;

    public ProcessExecutionException(String message) {
        super(message);
    }

    public ProcessExecutionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProcessExecutionException(String message, ProcessExecutionDetail executionDetail) {
        this(message, executionDetail, null);
    }

    public ProcessExecutionException(String message, Throwable cause, String executionDetailUri) {
        super(message, cause);
        this.executionDetailUri = executionDetailUri;
    }

    public ProcessExecutionException(final String message, final ProcessExecutionDetail executionDetail, final Throwable cause) {
        super(message, cause);
        this.executionDetail = executionDetail;
        if (executionDetail != null) {
            this.executionDetailUri = executionDetail.getUri();
        }
    }

    public ProcessExecutionDetail getExecutionDetail() {
        return executionDetail;
    }

    public String getExecutionDetailUri() {
        return executionDetailUri;
    }
}
