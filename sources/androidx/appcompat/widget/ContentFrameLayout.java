package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TypedValue f1402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TypedValue f1403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f1404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TypedValue f1405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f1406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypedValue f1407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f1408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f1409h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1408g = new Rect();
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f1408g.set(i10, i11, i12, i13);
        if (androidx.core.view.h.H(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1406e == null) {
            this.f1406e = new TypedValue();
        }
        return this.f1406e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1407f == null) {
            this.f1407f = new TypedValue();
        }
        return this.f1407f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1404c == null) {
            this.f1404c = new TypedValue();
        }
        return this.f1404c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1405d == null) {
            this.f1405d = new TypedValue();
        }
        return this.f1405d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1402a == null) {
            this.f1402a = new TypedValue();
        }
        return this.f1402a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1403b == null) {
            this.f1403b = new TypedValue();
        }
        return this.f1403b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1409h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1409h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1409h = aVar;
    }
}
