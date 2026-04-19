package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import io.flutter.view.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import rc.a;

/* JADX INFO: loaded from: classes2.dex */
public class c extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f13173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rc.a f13174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AccessibilityManager f13175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AccessibilityViewEmbedder f13176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wc.l f13177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ContentResolver f13178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, l> f13179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<Integer, h> f13180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f13181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f13182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f13183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f13185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f13186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f13187o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<Integer> f13188p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f13189q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f13190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k f13191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f13193u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final a.b f13194v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f13195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f13196x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ContentObserver f13197y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f13172z = ((g.SCROLL_RIGHT.f13237a | g.SCROLL_LEFT.f13237a) | g.SCROLL_UP.f13237a) | g.SCROLL_DOWN.f13237a;
    private static final int A = ((((((((((i.HAS_CHECKED_STATE.f13268a | i.IS_CHECKED.f13268a) | i.IS_SELECTED.f13268a) | i.IS_TEXT_FIELD.f13268a) | i.IS_FOCUSED.f13268a) | i.HAS_ENABLED_STATE.f13268a) | i.IS_ENABLED.f13268a) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f13268a) | i.HAS_TOGGLED_STATE.f13268a) | i.IS_TOGGLED.f13268a) | i.IS_FOCUSABLE.f13268a) | i.IS_SLIDER.f13268a;
    private static int B = 267386881;
    static int C = (g.DID_GAIN_ACCESSIBILITY_FOCUS.f13237a & g.DID_LOSE_ACCESSIBILITY_FOCUS.f13237a) & g.SHOW_ON_SCREEN.f13237a;

    class a implements a.b {
        a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            c.this.d0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.c0(byteBuffer, strArr);
        }

        @Override // rc.a.b
        public void c(int i10) {
            c.this.T(i10, 1);
        }

        @Override // rc.a.b
        public void d(String str) {
            c.this.f13173a.announceForAccessibility(str);
        }

        @Override // rc.a.b
        public void e(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent accessibilityEventI = c.this.I(0, 32);
            accessibilityEventI.getText().add(str);
            c.this.U(accessibilityEventI);
        }

        @Override // rc.a.b
        public void f(int i10) {
            c.this.T(i10, 8);
        }

        @Override // rc.a.b
        public void g(int i10) {
            c.this.T(i10, 2);
        }
    }

    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            if (c.this.f13193u) {
                return;
            }
            c cVar = c.this;
            if (z10) {
                cVar.f13174b.g(c.this.f13194v);
                c.this.f13174b.e();
            } else {
                cVar.Y(false);
                c.this.f13174b.g(null);
                c.this.f13174b.d();
            }
            if (c.this.f13191s != null) {
                c.this.f13191s.a(z10, c.this.f13175c.isTouchExplorationEnabled());
            }
        }
    }

    /* JADX INFO: renamed from: io.flutter.view.c$c, reason: collision with other inner class name */
    class C0316c extends ContentObserver {
        C0316c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            onChange(z10, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            if (c.this.f13193u) {
                return;
            }
            if (Settings.Global.getFloat(c.this.f13178f, "transition_animation_scale", 1.0f) == 0.0f) {
                c.f(c.this, f.DISABLE_ANIMATIONS.f13212a);
            } else {
                c.e(c.this, ~f.DISABLE_ANIMATIONS.f13212a);
            }
            c.this.V();
        }
    }

    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f13201a;

        d(AccessibilityManager accessibilityManager) {
            this.f13201a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            if (c.this.f13193u) {
                return;
            }
            if (!z10) {
                c.this.Y(false);
                c.this.N();
            }
            if (c.this.f13191s != null) {
                c.this.f13191s.a(this.f13201a.isEnabled(), z10);
            }
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13203a;

        static {
            int[] iArr = new int[o.values().length];
            f13203a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13203a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13212a;

        f(int i10) {
            this.f13212a = i10;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13237a;

        g(int i10) {
            this.f13237a = i10;
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13238a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f13239b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f13240c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f13241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f13242e;

        h() {
        }
    }

    enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13268a;

        i(int i10) {
            this.f13268a = i10;
        }
    }

    private static class j extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f13269d;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z10, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class l {
        private p B;
        private int D;
        private int E;
        private int F;
        private int G;
        private float H;
        private float I;
        private float J;
        private String K;
        private String L;
        private float M;
        private float N;
        private float O;
        private float P;
        private float[] Q;
        private l R;
        private List<h> U;
        private h V;
        private h W;
        private float[] Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f13270a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private float[] f13271a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private Rect f13273b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f13274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f13275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f13276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f13277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f13278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f13279h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f13280i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f13281j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f13282k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f13283l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f13284m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f13285n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f13286o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f13287p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<n> f13288q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f13289r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List<n> f13290s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f13291t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private List<n> f13292u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private String f13293v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private List<n> f13294w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f13295x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private List<n> f13296y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f13297z;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f13272b = -1;
        private int A = -1;
        private boolean C = false;
        private List<l> S = new ArrayList();
        private List<l> T = new ArrayList();
        private boolean X = true;
        private boolean Z = true;

        l(c cVar) {
            this.f13270a = cVar;
        }

        private float A0(float f10, float f11, float f12, float f13) {
            return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
        }

        private float B0(float f10, float f11, float f12, float f13) {
            return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean C0(l lVar, gd.d<l> dVar) {
            return (lVar == null || lVar.l0(dVar) == null) ? false : true;
        }

        private void D0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f10 = fArr[3];
            fArr[0] = fArr[0] / f10;
            fArr[1] = fArr[1] / f10;
            fArr[2] = fArr[2] / f10;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E0(float[] fArr, Set<l> set, boolean z10) {
            set.add(this);
            if (this.Z) {
                z10 = true;
            }
            if (z10) {
                if (this.f13271a0 == null) {
                    this.f13271a0 = new float[16];
                }
                if (this.Q == null) {
                    this.Q = new float[16];
                }
                Matrix.multiplyMM(this.f13271a0, 0, fArr, 0, this.Q, 0);
                float[] fArr2 = {this.M, this.N, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                D0(fArr3, this.f13271a0, fArr2);
                fArr2[0] = this.O;
                fArr2[1] = this.N;
                D0(fArr4, this.f13271a0, fArr2);
                fArr2[0] = this.O;
                fArr2[1] = this.P;
                D0(fArr5, this.f13271a0, fArr2);
                fArr2[0] = this.M;
                fArr2[1] = this.P;
                D0(fArr6, this.f13271a0, fArr2);
                if (this.f13273b0 == null) {
                    this.f13273b0 = new Rect();
                }
                this.f13273b0.set(Math.round(B0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(B0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(A0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(A0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Z = false;
            }
            int i10 = -1;
            for (l lVar : this.S) {
                lVar.A = i10;
                i10 = lVar.f13272b;
                lVar.E0(this.f13271a0, set, z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.C = true;
            this.K = this.f13289r;
            this.L = this.f13287p;
            this.D = this.f13274c;
            this.E = this.f13275d;
            this.F = this.f13278g;
            this.G = this.f13279h;
            this.H = this.f13283l;
            this.I = this.f13284m;
            this.J = this.f13285n;
            this.f13274c = byteBuffer.getInt();
            this.f13275d = byteBuffer.getInt();
            this.f13276e = byteBuffer.getInt();
            this.f13277f = byteBuffer.getInt();
            this.f13278g = byteBuffer.getInt();
            this.f13279h = byteBuffer.getInt();
            this.f13280i = byteBuffer.getInt();
            this.f13281j = byteBuffer.getInt();
            this.f13282k = byteBuffer.getInt();
            this.f13283l = byteBuffer.getFloat();
            this.f13284m = byteBuffer.getFloat();
            this.f13285n = byteBuffer.getFloat();
            int i10 = byteBuffer.getInt();
            this.f13286o = i10 == -1 ? null : strArr[i10];
            int i11 = byteBuffer.getInt();
            this.f13287p = i11 == -1 ? null : strArr[i11];
            this.f13288q = q0(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.f13289r = i12 == -1 ? null : strArr[i12];
            this.f13290s = q0(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            this.f13291t = i13 == -1 ? null : strArr[i13];
            this.f13292u = q0(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            this.f13293v = i14 == -1 ? null : strArr[i14];
            this.f13294w = q0(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            this.f13295x = i15 == -1 ? null : strArr[i15];
            this.f13296y = q0(byteBuffer, byteBufferArr);
            int i16 = byteBuffer.getInt();
            this.f13297z = i16 == -1 ? null : strArr[i16];
            this.B = p.b(byteBuffer.getInt());
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            this.P = byteBuffer.getFloat();
            if (this.Q == null) {
                this.Q = new float[16];
            }
            for (int i17 = 0; i17 < 16; i17++) {
                this.Q[i17] = byteBuffer.getFloat();
            }
            this.X = true;
            this.Z = true;
            int i18 = byteBuffer.getInt();
            this.S.clear();
            this.T.clear();
            for (int i19 = 0; i19 < i18; i19++) {
                l lVarZ = this.f13270a.z(byteBuffer.getInt());
                lVarZ.R = this;
                this.S.add(lVarZ);
            }
            for (int i20 = 0; i20 < i18; i20++) {
                l lVarZ2 = this.f13270a.z(byteBuffer.getInt());
                lVarZ2.R = this;
                this.T.add(lVarZ2);
            }
            int i21 = byteBuffer.getInt();
            if (i21 == 0) {
                this.U = null;
                return;
            }
            List<h> list = this.U;
            if (list == null) {
                this.U = new ArrayList(i21);
            } else {
                list.clear();
            }
            for (int i22 = 0; i22 < i21; i22++) {
                h hVarY = this.f13270a.y(byteBuffer.getInt());
                if (hVarY.f13240c == g.TAP.f13237a) {
                    this.V = hVarY;
                } else if (hVarY.f13240c == g.LONG_PRESS.f13237a) {
                    this.W = hVarY;
                } else {
                    this.U.add(hVarY);
                }
                this.U.add(hVarY);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(List<l> list) {
            if (x0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator<l> it = this.S.iterator();
            while (it.hasNext()) {
                it.next().g0(list);
            }
        }

        private SpannableString h0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n nVar : list) {
                    int i10 = e.f13203a[nVar.f13300c.ordinal()];
                    if (i10 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f13298a, nVar.f13299b, 0);
                    } else if (i10 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f13269d)), nVar.f13298a, nVar.f13299b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i0() {
            String str;
            String str2 = this.f13287p;
            if (str2 == null && this.L == null) {
                return false;
            }
            return str2 == null || (str = this.L) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j0() {
            return (Float.isNaN(this.f13283l) || Float.isNaN(this.H) || this.H == this.f13283l) ? false : true;
        }

        private void k0() {
            if (this.X) {
                this.X = false;
                if (this.Y == null) {
                    this.Y = new float[16];
                }
                if (Matrix.invertM(this.Y, 0, this.Q, 0)) {
                    return;
                }
                Arrays.fill(this.Y, 0.0f);
            }
        }

        private l l0(gd.d<l> dVar) {
            for (l lVar = this.R; lVar != null; lVar = lVar.R) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect m0() {
            return this.f13273b0;
        }

        static /* synthetic */ int n(l lVar, int i10) {
            int i11 = lVar.f13279h + i10;
            lVar.f13279h = i11;
            return i11;
        }

        private CharSequence n0() {
            return h0(this.f13295x, this.f13296y);
        }

        static /* synthetic */ int o(l lVar, int i10) {
            int i11 = lVar.f13279h - i10;
            lVar.f13279h = i11;
            return i11;
        }

        private CharSequence o0() {
            return h0(this.f13287p, this.f13288q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String p0() {
            String str;
            if (x0(i.NAMES_ROUTE) && (str = this.f13287p) != null && !str.isEmpty()) {
                return this.f13287p;
            }
            Iterator<l> it = this.S.iterator();
            while (it.hasNext()) {
                String strP0 = it.next().p0();
                if (strP0 != null && !strP0.isEmpty()) {
                    return strP0;
                }
            }
            return null;
        }

        private List<n> q0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i10 = byteBuffer.getInt();
            a aVar = null;
            if (i10 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = byteBuffer.getInt();
                int i13 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i14 = e.f13203a[oVar.ordinal()];
                if (i14 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(aVar);
                    mVar.f13298a = i12;
                    mVar.f13299b = i13;
                    mVar.f13300c = oVar;
                    arrayList.add(mVar);
                } else if (i14 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(aVar);
                    jVar.f13298a = i12;
                    jVar.f13299b = i13;
                    jVar.f13300c = oVar;
                    jVar.f13269d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence r0() {
            CharSequence[] charSequenceArr = {o0(), n0()};
            CharSequence charSequenceConcat = null;
            for (int i10 = 0; i10 < 2; i10++) {
                CharSequence charSequence = charSequenceArr[i10];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence s0() {
            return h0(this.f13289r, this.f13290s);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence t0() {
            CharSequence[] charSequenceArr = {s0(), o0(), n0()};
            CharSequence charSequenceConcat = null;
            for (int i10 = 0; i10 < 3; i10++) {
                CharSequence charSequence = charSequenceArr[i10];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean u0(g gVar) {
            return (gVar.f13237a & this.E) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean v0(i iVar) {
            return (iVar.f13268a & this.D) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean w0(g gVar) {
            return (gVar.f13237a & this.f13275d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean x0(i iVar) {
            return (iVar.f13268a & this.f13274c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l y0(float[] fArr, boolean z10) {
            float f10 = fArr[3];
            boolean z11 = false;
            float f11 = fArr[0] / f10;
            float f12 = fArr[1] / f10;
            if (f11 < this.M || f11 >= this.O || f12 < this.N || f12 >= this.P) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.T) {
                if (!lVar.x0(i.IS_HIDDEN)) {
                    lVar.k0();
                    Matrix.multiplyMV(fArr2, 0, lVar.Y, 0, fArr, 0);
                    l lVarY0 = lVar.y0(fArr2, z10);
                    if (lVarY0 != null) {
                        return lVarY0;
                    }
                }
            }
            if (z10 && this.f13280i != -1) {
                z11 = true;
            }
            if (z0() || z11) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean z0() {
            String str;
            String str2;
            String str3;
            if (x0(i.SCOPES_ROUTE)) {
                return false;
            }
            if (x0(i.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.f13275d & (~c.f13172z)) == 0 && (this.f13274c & c.A) == 0 && ((str = this.f13287p) == null || str.isEmpty()) && (((str2 = this.f13289r) == null || str2.isEmpty()) && ((str3 = this.f13295x) == null || str3.isEmpty()))) ? false : true;
        }
    }

    private static class m extends n {
        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        o f13300c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private enum o {
        SPELLOUT,
        LOCALE
    }

    private enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p b(int i10) {
            return i10 != 1 ? i10 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public c(View view, rc.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, wc.l lVar) {
        this.f13179g = new HashMap();
        this.f13180h = new HashMap();
        this.f13184l = 0;
        this.f13188p = new ArrayList();
        this.f13189q = 0;
        this.f13190r = 0;
        this.f13192t = false;
        this.f13193u = false;
        this.f13194v = new a();
        b bVar = new b();
        this.f13195w = bVar;
        C0316c c0316c = new C0316c(new Handler());
        this.f13197y = c0316c;
        this.f13173a = view;
        this.f13174b = aVar;
        this.f13175c = accessibilityManager;
        this.f13178f = contentResolver;
        this.f13176d = accessibilityViewEmbedder;
        this.f13177e = lVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.f13196x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        c0316c.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, c0316c);
        if (Build.VERSION.SDK_INT >= 31) {
            Z();
        }
        lVar.a(this);
    }

    public c(View view, rc.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, wc.l lVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), lVar);
    }

    private l A() {
        return this.f13179g.get(0);
    }

    private void B(float f10, float f11, boolean z10) {
        l lVarY0;
        if (this.f13179g.isEmpty() || (lVarY0 = A().y0(new float[]{f10, f11, 0.0f, 1.0f}, z10)) == this.f13187o) {
            return;
        }
        if (lVarY0 != null) {
            T(lVarY0.f13272b, 128);
        }
        l lVar = this.f13187o;
        if (lVar != null) {
            T(lVar.f13272b, 256);
        }
        this.f13187o = lVarY0;
    }

    private boolean D(l lVar) {
        if (lVar.x0(i.SCOPES_ROUTE)) {
            return false;
        }
        return (lVar.t0() == null && (lVar.f13275d & (~C)) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean F(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean G(l lVar) {
        return lVar.x0(i.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent I(int i10, int i11) {
        AccessibilityEvent accessibilityEventH = H(i11);
        accessibilityEventH.setPackageName(this.f13173a.getContext().getPackageName());
        accessibilityEventH.setSource(this.f13173a, i10);
        return accessibilityEventH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        l lVar = this.f13187o;
        if (lVar != null) {
            T(lVar.f13272b, 256);
            this.f13187o = null;
        }
    }

    private void O(l lVar) {
        String strP0 = lVar.p0();
        if (strP0 == null) {
            strP0 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            X(strP0);
            return;
        }
        AccessibilityEvent accessibilityEventI = I(lVar.f13272b, 32);
        accessibilityEventI.getText().add(strP0);
        U(accessibilityEventI);
    }

    private boolean P(l lVar, int i10, Bundle bundle, boolean z10) {
        int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i12 = lVar.f13278g;
        int i13 = lVar.f13279h;
        R(lVar, i11, z10, z11);
        if (i12 != lVar.f13278g || i13 != lVar.f13279h) {
            String str = lVar.f13289r != null ? lVar.f13289r : "";
            AccessibilityEvent accessibilityEventI = I(lVar.f13272b, 8192);
            accessibilityEventI.getText().add(str);
            accessibilityEventI.setFromIndex(lVar.f13278g);
            accessibilityEventI.setToIndex(lVar.f13279h);
            accessibilityEventI.setItemCount(str.length());
            U(accessibilityEventI);
        }
        if (i11 == 1) {
            if (z10) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.w0(gVar)) {
                    this.f13174b.c(i10, gVar, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.w0(gVar2)) {
                return false;
            }
            this.f13174b.c(i10, gVar2, Boolean.valueOf(z11));
            return true;
        }
        if (i11 != 2) {
            return i11 == 4 || i11 == 8 || i11 == 16;
        }
        if (z10) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (lVar.w0(gVar3)) {
                this.f13174b.c(i10, gVar3, Boolean.valueOf(z11));
                return true;
            }
        }
        if (z10) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!lVar.w0(gVar4)) {
            return false;
        }
        this.f13174b.c(i10, gVar4, Boolean.valueOf(z11));
        return true;
    }

    private boolean Q(l lVar, int i10, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f13174b.c(i10, g.SET_TEXT, string);
        lVar.f13289r = string;
        lVar.f13290s = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
    
        r5 = r4.f13289r.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        r4.f13279h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        r4.f13279h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        io.flutter.view.c.l.n(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void R(io.flutter.view.c.l r4, int r5, boolean r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.R(io.flutter.view.c$l, int, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(AccessibilityEvent accessibilityEvent) {
        if (this.f13175c.isEnabled()) {
            this.f13173a.getParent().requestSendAccessibilityEvent(this.f13173a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.f13174b.f(this.f13184l);
    }

    private void W(int i10) {
        AccessibilityEvent accessibilityEventI = I(i10, 2048);
        accessibilityEventI.setContentChangeTypes(1);
        U(accessibilityEventI);
    }

    @TargetApi(28)
    private void X(String str) {
        this.f13173a.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(boolean z10) {
        if (this.f13192t == z10) {
            return;
        }
        this.f13192t = z10;
        this.f13184l = z10 ? this.f13184l | f.ACCESSIBLE_NAVIGATION.f13212a : this.f13184l & (~f.ACCESSIBLE_NAVIGATION.f13212a);
        V();
    }

    @TargetApi(31)
    private void Z() {
        View view = this.f13173a;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i10 = this.f13173a.getResources().getConfiguration().fontWeightAdjustment;
        this.f13184l = i10 != Integer.MAX_VALUE && i10 >= 300 ? this.f13184l | f.BOLD_TEXT.f13212a : this.f13184l & (~f.BOLD_TEXT.f13212a);
        V();
    }

    private boolean b0(final l lVar) {
        return lVar.f13281j > 0 && (l.C0(this.f13181i, new gd.d() { // from class: io.flutter.view.a
            @Override // gd.d
            public final boolean test(Object obj) {
                return c.F(lVar, (c.l) obj);
            }
        }) || !l.C0(this.f13181i, new gd.d() { // from class: io.flutter.view.b
            @Override // gd.d
            public final boolean test(Object obj) {
                return c.G((c.l) obj);
            }
        }));
    }

    static /* synthetic */ int e(c cVar, int i10) {
        int i11 = i10 & cVar.f13184l;
        cVar.f13184l = i11;
        return i11;
    }

    private void e0(l lVar) {
        View viewB;
        Integer num;
        lVar.R = null;
        if (lVar.f13280i != -1 && (num = this.f13182j) != null && this.f13176d.platformViewOfNode(num.intValue()) == this.f13177e.b(lVar.f13280i)) {
            T(this.f13182j.intValue(), 65536);
            this.f13182j = null;
        }
        if (lVar.f13280i != -1 && (viewB = this.f13177e.b(lVar.f13280i)) != null) {
            viewB.setImportantForAccessibility(4);
        }
        l lVar2 = this.f13181i;
        if (lVar2 == lVar) {
            T(lVar2.f13272b, 65536);
            this.f13181i = null;
        }
        if (this.f13185m == lVar) {
            this.f13185m = null;
        }
        if (this.f13187o == lVar) {
            this.f13187o = null;
        }
    }

    static /* synthetic */ int f(c cVar, int i10) {
        int i11 = i10 | cVar.f13184l;
        cVar.f13184l = i11;
        return i11;
    }

    private AccessibilityEvent u(int i10, String str, String str2) {
        AccessibilityEvent accessibilityEventI = I(i10, 16);
        accessibilityEventI.setBeforeText(str);
        accessibilityEventI.getText().add(str2);
        int i11 = 0;
        while (i11 < str.length() && i11 < str2.length() && str.charAt(i11) == str2.charAt(i11)) {
            i11++;
        }
        if (i11 >= str.length() && i11 >= str2.length()) {
            return null;
        }
        accessibilityEventI.setFromIndex(i11);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i11 && length2 >= i11 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        accessibilityEventI.setRemovedCount((length - i11) + 1);
        accessibilityEventI.setAddedCount((length2 - i11) + 1);
        return accessibilityEventI;
    }

    @TargetApi(28)
    private boolean v() {
        Activity activityE = gd.h.e(this.f13173a.getContext());
        if (activityE == null || activityE.getWindow() == null) {
            return false;
        }
        int i10 = activityE.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i10 == 2 || i10 == 0;
    }

    private Rect x(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f13173a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h y(int i10) {
        h hVar = this.f13180h.get(Integer.valueOf(i10));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f13239b = i10;
        hVar2.f13238a = B + i10;
        this.f13180h.put(Integer.valueOf(i10), hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l z(int i10) {
        l lVar = this.f13179g.get(Integer.valueOf(i10));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f13272b = i10;
        this.f13179g.put(Integer.valueOf(i10), lVar2);
        return lVar2;
    }

    public boolean C() {
        return this.f13175c.isEnabled();
    }

    public boolean E() {
        return this.f13175c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent H(int i10) {
        return AccessibilityEvent.obtain(i10);
    }

    public AccessibilityNodeInfo J(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo K(View view, int i10) {
        return AccessibilityNodeInfo.obtain(view, i10);
    }

    public boolean L(MotionEvent motionEvent) {
        return M(motionEvent, false);
    }

    public boolean M(MotionEvent motionEvent, boolean z10) {
        if (!this.f13175c.isTouchExplorationEnabled() || this.f13179g.isEmpty()) {
            return false;
        }
        l lVarY0 = A().y0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z10);
        if (lVarY0 != null && lVarY0.f13280i != -1) {
            if (z10) {
                return false;
            }
            return this.f13176d.onAccessibilityHoverEvent(lVarY0.f13272b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            B(motionEvent.getX(), motionEvent.getY(), z10);
        } else {
            if (motionEvent.getAction() != 10) {
                cc.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            N();
        }
        return true;
    }

    public void S() {
        this.f13193u = true;
        this.f13177e.d();
        a0(null);
        this.f13175c.removeAccessibilityStateChangeListener(this.f13195w);
        this.f13175c.removeTouchExplorationStateChangeListener(this.f13196x);
        this.f13178f.unregisterContentObserver(this.f13197y);
        this.f13174b.g(null);
    }

    public void T(int i10, int i11) {
        if (this.f13175c.isEnabled()) {
            U(I(i10, i11));
        }
    }

    public void a0(k kVar) {
        this.f13191s = kVar;
    }

    void c0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h hVarY = y(byteBuffer.getInt());
            hVarY.f13240c = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            String str = null;
            hVarY.f13241d = i10 == -1 ? null : strArr[i10];
            int i11 = byteBuffer.getInt();
            if (i11 != -1) {
                str = strArr[i11];
            }
            hVarY.f13242e = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0467  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r14) {
        /*
            Method dump skipped, instruction units count: 1185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    void d0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f10;
        float f11;
        WindowInsets rootWindowInsets;
        View viewB;
        ArrayList<l> arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l lVarZ = z(byteBuffer.getInt());
            lVarZ.F0(byteBuffer, strArr, byteBufferArr);
            if (!lVarZ.x0(i.IS_HIDDEN)) {
                if (lVarZ.x0(i.IS_FOCUSED)) {
                    this.f13185m = lVarZ;
                }
                if (lVarZ.C) {
                    arrayList.add(lVarZ);
                }
                if (lVarZ.f13280i != -1 && !this.f13177e.c(lVarZ.f13280i) && (viewB = this.f13177e.b(lVarZ.f13280i)) != null) {
                    viewB.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l lVarA = A();
        ArrayList<l> arrayList2 = new ArrayList();
        if (lVarA != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT >= 28 ? v() : true) && (rootWindowInsets = this.f13173a.getRootWindowInsets()) != null) {
                if (!this.f13190r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    lVarA.Z = true;
                    lVarA.X = true;
                }
                this.f13190r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
            }
            lVarA.E0(fArr, hashSet, false);
            lVarA.g0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f13188p.contains(Integer.valueOf(lVar4.f13272b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f13272b != this.f13189q || arrayList2.size() != this.f13188p.size())) {
            this.f13189q = lVar3.f13272b;
            O(lVar3);
        }
        this.f13188p.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f13188p.add(Integer.valueOf(((l) it.next()).f13272b));
        }
        Iterator<Map.Entry<Integer, l>> it2 = this.f13179g.entrySet().iterator();
        while (it2.hasNext()) {
            l value = it2.next().getValue();
            if (!hashSet.contains(value)) {
                e0(value);
                it2.remove();
            }
        }
        W(0);
        for (l lVar5 : arrayList) {
            if (lVar5.j0()) {
                AccessibilityEvent accessibilityEventI = I(lVar5.f13272b, 4096);
                float f12 = lVar5.f13283l;
                float f13 = lVar5.f13284m;
                if (Float.isInfinite(lVar5.f13284m)) {
                    if (f12 > 70000.0f) {
                        f12 = 70000.0f;
                    }
                    f13 = 100000.0f;
                }
                if (Float.isInfinite(lVar5.f13285n)) {
                    f10 = f13 + 100000.0f;
                    if (f12 < -70000.0f) {
                        f12 = -70000.0f;
                    }
                    f11 = f12 + 100000.0f;
                } else {
                    f10 = f13 - lVar5.f13285n;
                    f11 = f12 - lVar5.f13285n;
                }
                if (lVar5.u0(g.SCROLL_UP) || lVar5.u0(g.SCROLL_DOWN)) {
                    accessibilityEventI.setScrollY((int) f11);
                    accessibilityEventI.setMaxScrollY((int) f10);
                } else if (lVar5.u0(g.SCROLL_LEFT) || lVar5.u0(g.SCROLL_RIGHT)) {
                    accessibilityEventI.setScrollX((int) f11);
                    accessibilityEventI.setMaxScrollX((int) f10);
                }
                if (lVar5.f13281j > 0) {
                    accessibilityEventI.setItemCount(lVar5.f13281j);
                    accessibilityEventI.setFromIndex(lVar5.f13282k);
                    Iterator it3 = lVar5.T.iterator();
                    int i10 = 0;
                    while (it3.hasNext()) {
                        if (!((l) it3.next()).x0(i.IS_HIDDEN)) {
                            i10++;
                        }
                    }
                    accessibilityEventI.setToIndex((lVar5.f13282k + i10) - 1);
                }
                U(accessibilityEventI);
            }
            if (lVar5.x0(i.IS_LIVE_REGION) && lVar5.i0()) {
                W(lVar5.f13272b);
            }
            l lVar6 = this.f13181i;
            if (lVar6 != null && lVar6.f13272b == lVar5.f13272b) {
                i iVar = i.IS_SELECTED;
                if (!lVar5.v0(iVar) && lVar5.x0(iVar)) {
                    AccessibilityEvent accessibilityEventI2 = I(lVar5.f13272b, 4);
                    accessibilityEventI2.getText().add(lVar5.f13287p);
                    U(accessibilityEventI2);
                }
            }
            l lVar7 = this.f13185m;
            if (lVar7 != null && lVar7.f13272b == lVar5.f13272b && ((lVar2 = this.f13186n) == null || lVar2.f13272b != this.f13185m.f13272b)) {
                this.f13186n = this.f13185m;
                U(I(lVar5.f13272b, 8));
            } else if (this.f13185m == null) {
                this.f13186n = null;
            }
            l lVar8 = this.f13185m;
            if (lVar8 != null && lVar8.f13272b == lVar5.f13272b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar5.v0(iVar2) && lVar5.x0(iVar2) && ((lVar = this.f13181i) == null || lVar.f13272b == this.f13185m.f13272b)) {
                    String str = lVar5.K != null ? lVar5.K : "";
                    String str2 = lVar5.f13289r != null ? lVar5.f13289r : "";
                    AccessibilityEvent accessibilityEventU = u(lVar5.f13272b, str, str2);
                    if (accessibilityEventU != null) {
                        U(accessibilityEventU);
                    }
                    if (lVar5.F != lVar5.f13278g || lVar5.G != lVar5.f13279h) {
                        AccessibilityEvent accessibilityEventI3 = I(lVar5.f13272b, 8192);
                        accessibilityEventI3.getText().add(str2);
                        accessibilityEventI3.setFromIndex(lVar5.f13278g);
                        accessibilityEventI3.setToIndex(lVar5.f13279h);
                        accessibilityEventI3.setItemCount(str2.length());
                        U(accessibilityEventI3);
                    }
                }
            }
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        l lVar;
        Integer num;
        int iIntValue;
        if (i10 == 1) {
            lVar = this.f13185m;
            if (lVar == null) {
                num = this.f13183k;
                if (num == null) {
                }
                iIntValue = num.intValue();
                return createAccessibilityNodeInfo(iIntValue);
            }
            iIntValue = lVar.f13272b;
            return createAccessibilityNodeInfo(iIntValue);
        }
        if (i10 != 2) {
            return null;
        }
        lVar = this.f13181i;
        if (lVar == null) {
            num = this.f13182j;
            if (num == null) {
                return null;
            }
            iIntValue = num.intValue();
            return createAccessibilityNodeInfo(iIntValue);
        }
        iIntValue = lVar.f13272b;
        return createAccessibilityNodeInfo(iIntValue);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i10, int i11, Bundle bundle) {
        int i12;
        if (i10 >= 65536) {
            boolean zPerformAction = this.f13176d.performAction(i10, i11, bundle);
            if (zPerformAction && i11 == 128) {
                this.f13182j = null;
            }
            return zPerformAction;
        }
        l lVar = this.f13179g.get(Integer.valueOf(i10));
        boolean z10 = false;
        if (lVar == null) {
            return false;
        }
        switch (i11) {
            case 16:
                this.f13174b.b(i10, g.TAP);
                return true;
            case 32:
                this.f13174b.b(i10, g.LONG_PRESS);
                return true;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                if (this.f13181i == null) {
                    this.f13173a.invalidate();
                }
                this.f13181i = lVar;
                this.f13174b.b(i10, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap map = new HashMap();
                map.put("type", "didGainFocus");
                map.put("nodeId", Integer.valueOf(lVar.f13272b));
                this.f13174b.f19242a.c(map);
                T(i10, 32768);
                if (lVar.w0(g.INCREASE) || lVar.w0(g.DECREASE)) {
                    T(i10, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f13181i;
                if (lVar2 != null && lVar2.f13272b == i10) {
                    this.f13181i = null;
                }
                Integer num = this.f13182j;
                if (num != null && num.intValue() == i10) {
                    this.f13182j = null;
                }
                this.f13174b.b(i10, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                T(i10, 65536);
                return true;
            case 256:
                return P(lVar, i10, bundle, true);
            case 512:
                return P(lVar, i10, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.w0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.w0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.w0(gVar)) {
                            return false;
                        }
                        lVar.f13289r = lVar.f13291t;
                        lVar.f13290s = lVar.f13292u;
                        T(i10, 4);
                    }
                }
                this.f13174b.b(i10, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.w0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.w0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.w0(gVar2)) {
                            return false;
                        }
                        lVar.f13289r = lVar.f13293v;
                        lVar.f13290s = lVar.f13294w;
                        T(i10, 4);
                    }
                }
                this.f13174b.b(i10, gVar2);
                return true;
            case 16384:
                this.f13174b.b(i10, g.COPY);
                return true;
            case 32768:
                this.f13174b.b(i10, g.PASTE);
                return true;
            case 65536:
                this.f13174b.b(i10, g.CUT);
                return true;
            case 131072:
                HashMap map2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z10 = true;
                }
                if (z10) {
                    map2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i12 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    map2.put("base", Integer.valueOf(lVar.f13279h));
                    i12 = lVar.f13279h;
                }
                map2.put("extent", Integer.valueOf(i12));
                this.f13174b.c(i10, g.SET_SELECTION, map2);
                l lVar3 = this.f13179g.get(Integer.valueOf(i10));
                lVar3.f13278g = ((Integer) map2.get("base")).intValue();
                lVar3.f13279h = ((Integer) map2.get("extent")).intValue();
                return true;
            case 1048576:
                this.f13174b.b(i10, g.DISMISS);
                return true;
            case 2097152:
                return Q(lVar, i10, bundle);
            case android.R.id.accessibilityActionShowOnScreen:
                this.f13174b.b(i10, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f13180h.get(Integer.valueOf(i11 - B));
                if (hVar == null) {
                    return false;
                }
                this.f13174b.c(i10, g.CUSTOM_ACTION, Integer.valueOf(hVar.f13239b));
                return true;
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean w(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f13176d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f13176d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f13183k = recordFlutterId;
            this.f13185m = null;
            return true;
        }
        if (eventType == 128) {
            this.f13187o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f13182j = recordFlutterId;
            this.f13181i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f13183k = null;
        this.f13182j = null;
        return true;
    }
}
