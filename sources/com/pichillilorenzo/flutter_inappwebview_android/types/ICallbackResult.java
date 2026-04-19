package com.pichillilorenzo.flutter_inappwebview_android.types;

import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public interface ICallbackResult<T> extends j.d {
    T decodeResult(Object obj);

    void defaultBehaviour(T t10);

    @Override // sc.j.d
    /* synthetic */ void error(String str, String str2, Object obj);

    boolean nonNullSuccess(T t10);

    @Override // sc.j.d
    /* synthetic */ void notImplemented();

    boolean nullSuccess();

    @Override // sc.j.d
    /* synthetic */ void success(Object obj);
}
