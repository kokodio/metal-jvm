package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;

public final class NSErrorException extends RuntimeException {
    private final String domain;
    private final long code;

    private NSErrorException(final String message, final String domain, final long code) {
        super(message);
        this.domain = domain;
        this.code = code;
    }

    /** @param error the NSError written by an {@code error:} out-parameter, may be nil */
    public static NSErrorException of(final String selector, final long error) {
        if (ObjC.isNil(error)) {
            return new NSErrorException(selector + " failed", "", 0L);
        }
        NSError nsError = new NSError(error);
        return new NSErrorException(nsError.localizedDescription(), nsError.domain(), nsError.code());
    }

    public String domain() {
        return this.domain;
    }

    public long code() {
        return this.code;
    }
}
