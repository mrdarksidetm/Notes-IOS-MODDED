package okhttp3.internal.http2;

import ae.r;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorCode f17535a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super(r.m("stream was reset: ", errorCode));
        r.f(errorCode, "errorCode");
        this.f17535a = errorCode;
    }
}
