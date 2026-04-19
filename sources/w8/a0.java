package w8;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class a0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f22592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f22593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f22594c;

    a0(Intent intent, Activity activity, int i10) {
        this.f22592a = intent;
        this.f22593b = activity;
        this.f22594c = i10;
    }

    @Override // w8.c0
    public final void a() {
        Intent intent = this.f22592a;
        if (intent != null) {
            this.f22593b.startActivityForResult(intent, this.f22594c);
        }
    }
}
