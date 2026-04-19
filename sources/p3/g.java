package p3;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.m;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18189d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f18190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18191b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18192c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f18193e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f18194f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f18195g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f18196h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f18197i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f18198j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f18199k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f18200l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f18201m = new a(256, null, m.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f18202n = new a(512, null, m.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f18203o = new a(1024, null, m.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f18204p = new a(2048, null, m.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f18205q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f18206r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f18207s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f18208t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f18209u = new a(65536, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f18210v = new a(131072, null, m.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f18211w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f18212x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f18213y = new a(1048576, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f18214z = new a(2097152, null, m.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f18215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<? extends m.a> f18217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final m f18218d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, m.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, m.f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, m.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends m.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i10, CharSequence charSequence, m mVar, Class<? extends m.a> cls) {
            this.f18216b = i10;
            this.f18218d = mVar;
            this.f18215a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f18217c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f18215a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f18215a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            if (this.f18218d == null) {
                return false;
            }
            m.a aVar = null;
            Class<? extends m.a> cls = this.f18217c;
            if (cls != null) {
                try {
                    m.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e10) {
                        e = e10;
                        aVar = aVarNewInstance;
                        Class<? extends m.a> cls2 = this.f18217c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            return this.f18218d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f18215a;
            Object obj3 = ((a) obj).f18215a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f18215a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strJ = g.j(this.f18216b);
            if (strJ.equals("ACTION_UNKNOWN") && b() != null) {
                strJ = b().toString();
            }
            sb2.append(strJ);
            return sb2.toString();
        }
    }

    private static class b {
        public static Object a(int i10, float f10, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static f a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static g b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return g.P0(accessibilityNodeInfo.getChild(i10, i11));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static g f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return g.P0(accessibilityNodeInfo.getParent(i10));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j10));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f18219a;

        e(Object obj) {
            this.f18219a = obj;
        }

        public static e a(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f18220a;

        f(Object obj) {
            this.f18220a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    /* JADX INFO: renamed from: p3.g$g, reason: collision with other inner class name */
    public static class C0382g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f18221a;

        C0382g(Object obj) {
            this.f18221a = obj;
        }

        public static C0382g a(int i10, float f10, float f11, float f12) {
            return new C0382g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }
    }

    private g(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f18190a = accessibilityNodeInfo;
    }

    @Deprecated
    public g(Object obj) {
        this.f18190a = (AccessibilityNodeInfo) obj;
    }

    private boolean E() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int F(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f18189d;
        f18189d = i11 + 1;
        return i11;
    }

    public static g O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new g(accessibilityNodeInfo);
    }

    static g P0(Object obj) {
        if (obj != null) {
            return new g(obj);
        }
        return null;
    }

    public static g W() {
        return O0(AccessibilityNodeInfo.obtain());
    }

    private void Y(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayY = y(view);
        if (sparseArrayY != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayY.size(); i10++) {
                if (sparseArrayY.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayY.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void a0(int i10, boolean z10) {
        Bundle bundleT = t();
        if (bundleT != null) {
            int i11 = bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleT.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void g() {
        this.f18190a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f18190a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f18190a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f18190a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> h(String str) {
        ArrayList<Integer> integerArrayList = this.f18190a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f18190a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean k(int i10) {
        Bundle bundleT = t();
        return bundleT != null && (bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> w(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayY = y(view);
        if (sparseArrayY != null) {
            return sparseArrayY;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(c3.d.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> y(View view) {
        return (SparseArray) view.getTag(c3.d.I);
    }

    public CharSequence A() {
        if (!E()) {
            return this.f18190a.getText();
        }
        List<Integer> listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f18190a.getText(), 0, this.f18190a.getText().length()));
        for (int i10 = 0; i10 < listH.size(); i10++) {
            spannableString.setSpan(new p3.a(listH4.get(i10).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listH.get(i10).intValue(), listH2.get(i10).intValue(), listH3.get(i10).intValue());
        }
        return spannableString;
    }

    public void A0(CharSequence charSequence) {
        this.f18190a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public CharSequence B() {
        return Build.VERSION.SDK_INT >= 28 ? this.f18190a.getTooltipText() : this.f18190a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void B0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f18190a.setScreenReaderFocusable(z10);
        } else {
            a0(1, z10);
        }
    }

    public String C() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f18190a) : this.f18190a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void C0(boolean z10) {
        this.f18190a.setScrollable(z10);
    }

    public String D() {
        return this.f18190a.getViewIdResourceName();
    }

    public void D0(boolean z10) {
        this.f18190a.setSelected(z10);
    }

    public void E0(View view, int i10) {
        this.f18192c = i10;
        this.f18190a.setSource(view, i10);
    }

    public void F0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f18190a, charSequence);
        } else {
            this.f18190a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean G() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f18190a) : k(64);
    }

    public void G0(CharSequence charSequence) {
        this.f18190a.setText(charSequence);
    }

    public boolean H() {
        return this.f18190a.isCheckable();
    }

    public void H0(int i10, int i11) {
        this.f18190a.setTextSelection(i10, i11);
    }

    public boolean I() {
        return this.f18190a.isChecked();
    }

    public void I0(View view) {
        this.f18190a.setTraversalAfter(view);
    }

    public boolean J() {
        return this.f18190a.isClickable();
    }

    public void J0(View view) {
        this.f18190a.setTraversalBefore(view);
    }

    public boolean K() {
        return this.f18190a.isContextClickable();
    }

    public void K0(View view, int i10) {
        this.f18190a.setTraversalBefore(view, i10);
    }

    public boolean L() {
        return this.f18190a.isEnabled();
    }

    public void L0(String str) {
        this.f18190a.setViewIdResourceName(str);
    }

    public boolean M() {
        return this.f18190a.isFocusable();
    }

    public void M0(boolean z10) {
        this.f18190a.setVisibleToUser(z10);
    }

    public boolean N() {
        return this.f18190a.isFocused();
    }

    public AccessibilityNodeInfo N0() {
        return this.f18190a;
    }

    public boolean O() {
        return k(67108864);
    }

    public boolean P() {
        return this.f18190a.isImportantForAccessibility();
    }

    public boolean Q() {
        return this.f18190a.isLongClickable();
    }

    public boolean R() {
        return this.f18190a.isPassword();
    }

    public boolean S() {
        return this.f18190a.isScrollable();
    }

    public boolean T() {
        return this.f18190a.isSelected();
    }

    public boolean U() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f18190a) : k(8388608);
    }

    public boolean V() {
        return this.f18190a.isVisibleToUser();
    }

    public boolean X(int i10, Bundle bundle) {
        return this.f18190a.performAction(i10, bundle);
    }

    public void Z(boolean z10) {
        this.f18190a.setAccessibilityFocused(z10);
    }

    public void a(int i10) {
        this.f18190a.addAction(i10);
    }

    public void b(a aVar) {
        this.f18190a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f18215a);
    }

    public void b0(Rect rect) {
        this.f18190a.setBoundsInScreen(rect);
    }

    public void c(View view) {
        this.f18190a.addChild(view);
    }

    public void c0(boolean z10) {
        this.f18190a.setCheckable(z10);
    }

    public void d(View view, int i10) {
        this.f18190a.addChild(view, i10);
    }

    public void d0(boolean z10) {
        this.f18190a.setChecked(z10);
    }

    public void e0(CharSequence charSequence) {
        this.f18190a.setClassName(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f18190a;
        if (accessibilityNodeInfo == null) {
            if (gVar.f18190a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(gVar.f18190a)) {
            return false;
        }
        return this.f18192c == gVar.f18192c && this.f18191b == gVar.f18191b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            Y(view);
            ClickableSpan[] clickableSpanArrP = p(charSequence);
            if (clickableSpanArrP == null || clickableSpanArrP.length <= 0) {
                return;
            }
            t().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", c3.d.f6319a);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayW = w(view);
            for (int i10 = 0; i10 < clickableSpanArrP.length; i10++) {
                int iF = F(clickableSpanArrP[i10], sparseArrayW);
                sparseArrayW.put(iF, new WeakReference<>(clickableSpanArrP[i10]));
                e(clickableSpanArrP[i10], (Spanned) charSequence, iF);
            }
        }
    }

    public void f0(boolean z10) {
        this.f18190a.setClickable(z10);
    }

    public void g0(Object obj) {
        this.f18190a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f18219a);
    }

    public void h0(Object obj) {
        this.f18190a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f18220a);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f18190a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f18190a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void i0(CharSequence charSequence) {
        this.f18190a.setContentDescription(charSequence);
    }

    public void j0(boolean z10) {
        this.f18190a.setContentInvalid(z10);
    }

    public void k0(boolean z10) {
        this.f18190a.setEditable(z10);
    }

    @Deprecated
    public void l(Rect rect) {
        this.f18190a.getBoundsInParent(rect);
    }

    public void l0(boolean z10) {
        this.f18190a.setEnabled(z10);
    }

    public void m(Rect rect) {
        this.f18190a.getBoundsInScreen(rect);
    }

    public void m0(CharSequence charSequence) {
        this.f18190a.setError(charSequence);
    }

    public void n(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f18190a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f18190a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void n0(boolean z10) {
        this.f18190a.setFocusable(z10);
    }

    public CharSequence o() {
        return this.f18190a.getClassName();
    }

    public void o0(boolean z10) {
        this.f18190a.setFocused(z10);
    }

    public void p0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f18190a.setHeading(z10);
        } else {
            a0(2, z10);
        }
    }

    public CharSequence q() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f18190a) : this.f18190a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void q0(boolean z10) {
        this.f18190a.setImportantForAccessibility(z10);
    }

    public CharSequence r() {
        return this.f18190a.getContentDescription();
    }

    public void r0(int i10) {
        this.f18190a.setLiveRegion(i10);
    }

    public CharSequence s() {
        return this.f18190a.getError();
    }

    public void s0(boolean z10) {
        this.f18190a.setLongClickable(z10);
    }

    public Bundle t() {
        return this.f18190a.getExtras();
    }

    public void t0(int i10) {
        this.f18190a.setMovementGranularities(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb2.append("; boundsInParent: " + rect);
        m(rect);
        sb2.append("; boundsInScreen: " + rect);
        n(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(x());
        sb2.append("; className: ");
        sb2.append(o());
        sb2.append("; text: ");
        sb2.append(A());
        sb2.append("; error: ");
        sb2.append(s());
        sb2.append("; maxTextLength: ");
        sb2.append(u());
        sb2.append("; stateDescription: ");
        sb2.append(z());
        sb2.append("; contentDescription: ");
        sb2.append(r());
        sb2.append("; tooltipText: ");
        sb2.append(B());
        sb2.append("; viewIdResName: ");
        sb2.append(D());
        sb2.append("; uniqueId: ");
        sb2.append(C());
        sb2.append("; checkable: ");
        sb2.append(H());
        sb2.append("; checked: ");
        sb2.append(I());
        sb2.append("; focusable: ");
        sb2.append(M());
        sb2.append("; focused: ");
        sb2.append(N());
        sb2.append("; selected: ");
        sb2.append(T());
        sb2.append("; clickable: ");
        sb2.append(J());
        sb2.append("; longClickable: ");
        sb2.append(Q());
        sb2.append("; contextClickable: ");
        sb2.append(K());
        sb2.append("; enabled: ");
        sb2.append(L());
        sb2.append("; password: ");
        sb2.append(R());
        sb2.append("; scrollable: " + S());
        sb2.append("; containerTitle: ");
        sb2.append(q());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(O());
        sb2.append("; importantForAccessibility: ");
        sb2.append(P());
        sb2.append("; visible: ");
        sb2.append(V());
        sb2.append("; isTextSelectable: ");
        sb2.append(U());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(G());
        sb2.append("; [");
        List<a> listI = i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a aVar = listI.get(i10);
            String strJ = j(aVar.a());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                strJ = aVar.b().toString();
            }
            sb2.append(strJ);
            if (i10 != listI.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int u() {
        return this.f18190a.getMaxTextLength();
    }

    public void u0(CharSequence charSequence) {
        this.f18190a.setPackageName(charSequence);
    }

    public int v() {
        return this.f18190a.getMovementGranularities();
    }

    public void v0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f18190a.setPaneTitle(charSequence);
        } else {
            this.f18190a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void w0(View view) {
        this.f18191b = -1;
        this.f18190a.setParent(view);
    }

    public CharSequence x() {
        return this.f18190a.getPackageName();
    }

    public void x0(View view, int i10) {
        this.f18191b = i10;
        this.f18190a.setParent(view, i10);
    }

    public void y0(boolean z10) {
        this.f18190a.setPassword(z10);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f18190a) : this.f18190a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void z0(C0382g c0382g) {
        this.f18190a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c0382g.f18221a);
    }
}
