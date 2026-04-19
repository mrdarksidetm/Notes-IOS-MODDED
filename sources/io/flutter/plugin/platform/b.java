package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import io.flutter.embedding.android.a;

/* JADX INFO: loaded from: classes2.dex */
public class b extends io.flutter.embedding.android.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f13049g;

    public b(Context context, int i10, int i11, a aVar) {
        super(context, i10, i11, a.b.overlay);
        this.f13049g = aVar;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f13049g;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
