package i;

import ae.j;
import ae.r;
import android.content.Context;
import android.content.Intent;
import h.h;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i.a<h, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12041a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    @Override // i.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, h hVar) {
        r.f(context, "context");
        r.f(hVar, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
        r.e(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h.a parseResult(int i10, Intent intent) {
        return new h.a(i10, intent);
    }
}
