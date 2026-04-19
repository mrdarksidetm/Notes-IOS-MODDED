package i;

import ae.j;
import ae.r;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i.a<Intent, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12040a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    @Override // i.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Intent intent) {
        r.f(context, "context");
        r.f(intent, "input");
        return intent;
    }

    @Override // i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h.a parseResult(int i10, Intent intent) {
        return new h.a(i10, intent);
    }
}
