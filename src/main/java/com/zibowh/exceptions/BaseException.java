package com.zibowh.exceptions;

import com.zibowh.constants.ErrorConstants;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract public class BaseException extends RuntimeException {

    protected ErrorConstants errorConstant;

    protected Throwable exception;

    public BaseException(ErrorConstants errorConstant, Throwable e) {
        this.errorConstant = errorConstant;
        this.exception = e;
    }
}
