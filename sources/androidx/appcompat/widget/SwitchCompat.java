package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f1474j0 = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int[] f1475k0 = {R.attr.state_checked};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private final TextPaint I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f1476a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ColorStateList f1477a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f1478b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Layout f1479b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1480c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Layout f1481c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1482d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private TransformationMethod f1483d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1484e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    ObjectAnimator f1485e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1486f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final y f1487f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f1488g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private n f1489g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f1490h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private c f1491h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1492i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Rect f1493i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f1499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f1500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f1501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f1502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1505u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f1506v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f1507w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private VelocityTracker f1508x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1509y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f1510z;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1510z);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    static class b {
        static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    static class c extends e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<SwitchCompat> f1511a;

        c(SwitchCompat switchCompat) {
            this.f1511a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable th) {
            SwitchCompat switchCompat = this.f1511a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            SwitchCompat switchCompat = this.f1511a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a.K);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1478b = null;
        this.f1480c = null;
        this.f1482d = false;
        this.f1484e = false;
        this.f1488g = null;
        this.f1490h = null;
        this.f1492i = false;
        this.f1494j = false;
        this.f1508x = VelocityTracker.obtain();
        this.H = true;
        this.f1493i0 = new Rect();
        n0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = j.j.D2;
        r0 r0VarU = r0.u(context, attributeSet, iArr, i10, 0);
        androidx.core.view.h.U(this, context, iArr, attributeSet, r0VarU.q(), i10, 0);
        Drawable drawableF = r0VarU.f(j.j.G2);
        this.f1476a = drawableF;
        if (drawableF != null) {
            drawableF.setCallback(this);
        }
        Drawable drawableF2 = r0VarU.f(j.j.P2);
        this.f1486f = drawableF2;
        if (drawableF2 != null) {
            drawableF2.setCallback(this);
        }
        setTextOnInternal(r0VarU.o(j.j.E2));
        setTextOffInternal(r0VarU.o(j.j.F2));
        this.f1503s = r0VarU.a(j.j.H2, true);
        this.f1495k = r0VarU.e(j.j.M2, 0);
        this.f1496l = r0VarU.e(j.j.J2, 0);
        this.f1497m = r0VarU.e(j.j.K2, 0);
        this.f1498n = r0VarU.a(j.j.I2, false);
        ColorStateList colorStateListC = r0VarU.c(j.j.N2);
        if (colorStateListC != null) {
            this.f1478b = colorStateListC;
            this.f1482d = true;
        }
        PorterDuff.Mode modeE = c0.e(r0VarU.j(j.j.O2, -1), null);
        if (this.f1480c != modeE) {
            this.f1480c = modeE;
            this.f1484e = true;
        }
        if (this.f1482d || this.f1484e) {
            b();
        }
        ColorStateList colorStateListC2 = r0VarU.c(j.j.Q2);
        if (colorStateListC2 != null) {
            this.f1488g = colorStateListC2;
            this.f1492i = true;
        }
        PorterDuff.Mode modeE2 = c0.e(r0VarU.j(j.j.R2, -1), null);
        if (this.f1490h != modeE2) {
            this.f1490h = modeE2;
            this.f1494j = true;
        }
        if (this.f1492i || this.f1494j) {
            c();
        }
        int iM = r0VarU.m(j.j.L2, 0);
        if (iM != 0) {
            m(context, iM);
        }
        y yVar = new y(this);
        this.f1487f0 = yVar;
        yVar.m(attributeSet, i10);
        r0VarU.v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1505u = viewConfiguration.getScaledTouchSlop();
        this.f1509y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1474j0, z10 ? 1.0f : 0.0f);
        this.f1485e0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        b.a(this.f1485e0, true);
        this.f1485e0.start();
    }

    private void b() {
        Drawable drawable = this.f1476a;
        if (drawable != null) {
            if (this.f1482d || this.f1484e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.j(drawable).mutate();
                this.f1476a = drawableMutate;
                if (this.f1482d) {
                    androidx.core.graphics.drawable.a.g(drawableMutate, this.f1478b);
                }
                if (this.f1484e) {
                    androidx.core.graphics.drawable.a.h(this.f1476a, this.f1480c);
                }
                if (this.f1476a.isStateful()) {
                    this.f1476a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f1486f;
        if (drawable != null) {
            if (this.f1492i || this.f1494j) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.j(drawable).mutate();
                this.f1486f = drawableMutate;
                if (this.f1492i) {
                    androidx.core.graphics.drawable.a.g(drawableMutate, this.f1488g);
                }
                if (this.f1494j) {
                    androidx.core.graphics.drawable.a.h(this.f1486f, this.f1490h);
                }
                if (this.f1486f.isStateful()) {
                    this.f1486f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f1485e0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f1483d0);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    private n getEmojiTextViewHelper() {
        if (this.f1489g0 == null) {
            this.f1489g0 = new n(this);
        }
        return this.f1489g0;
    }

    private boolean getTargetCheckedState() {
        return this.f1510z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((z0.b(this) ? 1.0f - this.f1510z : this.f1510z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1486f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1493i0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1476a;
        Rect rectD = drawable2 != null ? c0.d(drawable2) : c0.f1620c;
        return ((((this.A - this.C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f1476a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1476a.getPadding(this.f1493i0);
        int i10 = this.E;
        int i11 = this.f1505u;
        int i12 = i10 - i11;
        int i13 = (this.D + thumbOffset) - i11;
        int i14 = this.C + i13;
        Rect rect = this.f1493i0;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.G + i11));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1501q;
            if (string == null) {
                string = getResources().getString(j.h.f13454b);
            }
            androidx.core.view.h.l0(this, string);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1499o;
            if (string == null) {
                string = getResources().getString(j.h.f13455c);
            }
            androidx.core.view.h.l0(this, string);
        }
    }

    private void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    private void p() {
        if (this.f1491h0 == null && this.f1489g0.b() && androidx.emoji2.text.e.i()) {
            androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
            int iE = eVarC.e();
            if (iE == 3 || iE == 0) {
                c cVar = new c(this);
                this.f1491h0 = cVar;
                eVarC.t(cVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f1504t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f1508x.computeCurrentVelocity(1000);
            float xVelocity = this.f1508x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1509y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!z0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1501q = charSequence;
        this.f1502r = g(charSequence);
        this.f1481c0 = null;
        if (this.f1503s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1499o = charSequence;
        this.f1500p = g(charSequence);
        this.f1479b0 = null;
        if (this.f1503s) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f1493i0;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1476a;
        Rect rectD = drawable != null ? c0.d(drawable) : c0.f1620c;
        Drawable drawable2 = this.f1486f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f1486f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1486f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1476a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.C + rect.right;
            this.f1476a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.d(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1476a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.c(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1486f;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.c(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1476a;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1486f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!z0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1497m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (z0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1497m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.e.m(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1503s;
    }

    public boolean getSplitTrack() {
        return this.f1498n;
    }

    public int getSwitchMinWidth() {
        return this.f1496l;
    }

    public int getSwitchPadding() {
        return this.f1497m;
    }

    public CharSequence getTextOff() {
        return this.f1501q;
    }

    public CharSequence getTextOn() {
        return this.f1499o;
    }

    public Drawable getThumbDrawable() {
        return this.f1476a;
    }

    protected final float getThumbPosition() {
        return this.f1510z;
    }

    public int getThumbTextPadding() {
        return this.f1495k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1478b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1480c;
    }

    public Drawable getTrackDrawable() {
        return this.f1486f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1488g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1490h;
    }

    void j() {
        setTextOnInternal(this.f1499o);
        setTextOffInternal(this.f1501q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1476a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1486f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1485e0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1485e0.end();
        this.f1485e0 = null;
    }

    public void m(Context context, int i10) {
        r0 r0VarS = r0.s(context, i10, j.j.S2);
        ColorStateList colorStateListC = r0VarS.c(j.j.W2);
        if (colorStateListC == null) {
            colorStateListC = getTextColors();
        }
        this.f1477a0 = colorStateListC;
        int iE = r0VarS.e(j.j.T2, 0);
        if (iE != 0) {
            float f10 = iE;
            if (f10 != this.I.getTextSize()) {
                this.I.setTextSize(f10);
                requestLayout();
            }
        }
        o(r0VarS.j(j.j.U2, -1), r0VarS.j(j.j.V2, -1));
        this.f1483d0 = r0VarS.a(j.j.f13481b3, false) ? new o.a(getContext()) : null;
        setTextOnInternal(this.f1499o);
        setTextOffInternal(this.f1501q);
        r0VarS.v();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.I.setFakeBoldText(false);
            this.I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.I.setFakeBoldText((i11 & 1) != 0);
            this.I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1475k0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1493i0;
        Drawable drawable = this.f1486f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1476a;
        if (drawable != null) {
            if (!this.f1498n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = c0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1479b0 : this.f1481c0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1477a0;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1499o : this.f1501q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f1476a != null) {
            Rect rect = this.f1493i0;
            Drawable drawable = this.f1486f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = c0.d(this.f1476a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (z0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.A) + iMax + iMax2;
        }
        int gravity = getGravity() & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i14 = this.B;
            paddingTop = paddingTop2 - (i14 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.B;
                this.D = paddingLeft;
                this.E = paddingTop;
                this.G = height;
                this.F = width;
            }
            paddingTop = getPaddingTop();
            i14 = this.B;
        }
        height = i14 + paddingTop;
        this.D = paddingLeft;
        this.E = paddingTop;
        this.G = height;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f1503s) {
            if (this.f1479b0 == null) {
                this.f1479b0 = i(this.f1500p);
            }
            if (this.f1481c0 == null) {
                this.f1481c0 = i(this.f1502r);
            }
        }
        Rect rect = this.f1493i0;
        Drawable drawable = this.f1476a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1476a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1476a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.C = Math.max(this.f1503s ? Math.max(this.f1479b0.getWidth(), this.f1481c0.getWidth()) + (this.f1495k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f1486f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1486f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f1476a;
        if (drawable3 != null) {
            Rect rectD = c0.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.H ? Math.max(this.f1496l, (this.C * 2) + iMax + iMax2) : this.f1496l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.A = iMax3;
        this.B = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1499o : this.f1501q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1508x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f1504t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1506v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.z0.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f1510z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f1510z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f1506v = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1506v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1505u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f1507w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1505u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f1504t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1506v = r0
            r6.f1507w = r3
            return r1
        L89:
            int r0 = r6.f1504t
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f1504t = r0
            android.view.VelocityTracker r0 = r6.f1508x
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f1504t = r1
            r6.f1506v = r0
            r6.f1507w = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && androidx.core.view.h.H(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.e.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f1499o);
        setTextOffInternal(this.f1501q);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1503s != z10) {
            this.f1503s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1498n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1496l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1497m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1476a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1476a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f1510z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(l.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1495k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1478b = colorStateList;
        this.f1482d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1480c = mode;
        this.f1484e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1486f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1486f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(l.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1488g = colorStateList;
        this.f1492i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1490h = mode;
        this.f1494j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1476a || drawable == this.f1486f;
    }
}
