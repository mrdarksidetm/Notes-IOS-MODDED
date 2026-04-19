package com.pichillilorenzo.flutter_inappwebview_android.types;

import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public interface IChannelDelegate extends j.c, Disposable {
    j getChannel();

    @Override // sc.j.c
    /* synthetic */ void onMethodCall(i iVar, j.d dVar);
}
