package b2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5240a;

    public e0(Context context) {
        this.f5240a = context;
    }

    @Override // b2.t1
    public void a(String str) {
        this.f5240a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
