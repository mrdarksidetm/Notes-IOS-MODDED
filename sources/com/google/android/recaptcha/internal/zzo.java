package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzo implements Executor {
    public static final zzo zza = new zzo();

    private zzo() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
