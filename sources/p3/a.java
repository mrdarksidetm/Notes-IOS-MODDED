package p3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f18187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18188c;

    public a(int i10, g gVar, int i11) {
        this.f18186a = i10;
        this.f18187b = gVar;
        this.f18188c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f18186a);
        this.f18187b.X(this.f18188c, bundle);
    }
}
