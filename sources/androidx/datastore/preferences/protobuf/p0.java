package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.l1;
import androidx.datastore.preferences.protobuf.y;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class p0<T> implements z0<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f3709r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f3710s = i1.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f3711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f3712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n0 f3715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f3717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f3718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f3719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f3720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f3721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f3722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r0 f3723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f3724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f1<?, ?> f3725o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p<?> f3726p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i0 f3727q;

    private p0(int[] iArr, Object[] objArr, int i10, int i11, n0 n0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, r0 r0Var, d0 d0Var, f1<?, ?> f1Var, p<?> pVar, i0 i0Var) {
        this.f3711a = iArr;
        this.f3712b = objArr;
        this.f3713c = i10;
        this.f3714d = i11;
        this.f3717g = n0Var instanceof w;
        this.f3718h = z10;
        this.f3716f = pVar != null && pVar.e(n0Var);
        this.f3719i = z11;
        this.f3720j = iArr2;
        this.f3721k = i12;
        this.f3722l = i13;
        this.f3723m = r0Var;
        this.f3724n = d0Var;
        this.f3725o = f1Var;
        this.f3726p = pVar;
        this.f3715e = n0Var;
        this.f3727q = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i10, z0 z0Var) {
        return z0Var.d(i1.A(obj, R(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean B(Object obj, int i10, int i11) {
        List list = (List) i1.A(obj, R(i10));
        if (list.isEmpty()) {
            return true;
        }
        z0 z0VarS = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!z0VarS.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.z0] */
    private boolean C(T t10, int i10, int i11) {
        Map<?, ?> mapH = this.f3727q.h(i1.A(t10, R(i10)));
        if (mapH.isEmpty()) {
            return true;
        }
        if (this.f3727q.c(r(i11)).f3578c.a() != k1.c.MESSAGE) {
            return true;
        }
        ?? D = 0;
        for (Object obj : mapH.values()) {
            D = D;
            if (D == 0) {
                D = v0.a().d(obj.getClass());
            }
            if (!D.d(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean D(T t10, T t11, int i10) {
        long jY = Y(i10) & 1048575;
        return i1.x(t10, jY) == i1.x(t11, jY);
    }

    private boolean E(T t10, int i10, int i11) {
        return i1.x(t10, (long) (Y(i11) & 1048575)) == i10;
    }

    private static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> G(Object obj, long j10) {
        return (List) i1.A(obj, j10);
    }

    private static <T> long H(T t10, long j10) {
        return i1.y(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r0 = r16.f3721k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r0 >= r16.f3722l) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        r13 = n(r19, r16.f3720j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r13 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.t.b<ET>> void I(androidx.datastore.preferences.protobuf.f1<UT, UB> r17, androidx.datastore.preferences.protobuf.p<ET> r18, T r19, androidx.datastore.preferences.protobuf.y0 r20, androidx.datastore.preferences.protobuf.o r21) {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.I(androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.y0, androidx.datastore.preferences.protobuf.o):void");
    }

    private final <K, V> void J(Object obj, int i10, Object obj2, o oVar, y0 y0Var) {
        long jR = R(i0(i10));
        Object objA = i1.A(obj, jR);
        if (objA == null) {
            objA = this.f3727q.e(obj2);
            i1.O(obj, jR, objA);
        } else if (this.f3727q.g(objA)) {
            Object objE = this.f3727q.e(obj2);
            this.f3727q.a(objE, objA);
            i1.O(obj, jR, objE);
            objA = objE;
        }
        y0Var.s(this.f3727q.d(objA), this.f3727q.c(obj2), oVar);
    }

    private void K(T t10, T t11, int i10) {
        long jR = R(i0(i10));
        if (y(t11, i10)) {
            Object objA = i1.A(t10, jR);
            Object objA2 = i1.A(t11, jR);
            if (objA != null && objA2 != null) {
                objA2 = y.h(objA, objA2);
            } else if (objA2 == null) {
                return;
            }
            i1.O(t10, jR, objA2);
            e0(t10, i10);
        }
    }

    private void L(T t10, T t11, int i10) {
        int iI0 = i0(i10);
        int iQ = Q(i10);
        long jR = R(iI0);
        if (E(t11, iQ, i10)) {
            Object objA = i1.A(t10, jR);
            Object objA2 = i1.A(t11, jR);
            if (objA != null && objA2 != null) {
                objA2 = y.h(objA, objA2);
            } else if (objA2 == null) {
                return;
            }
            i1.O(t10, jR, objA2);
            f0(t10, iQ, i10);
        }
    }

    private void M(T t10, T t11, int i10) {
        int iI0 = i0(i10);
        long jR = R(iI0);
        int iQ = Q(i10);
        switch (h0(iI0)) {
            case 0:
                if (y(t11, i10)) {
                    i1.K(t10, jR, i1.v(t11, jR));
                    e0(t10, i10);
                }
                break;
            case 1:
                if (y(t11, i10)) {
                    i1.L(t10, jR, i1.w(t11, jR));
                    e0(t10, i10);
                }
                break;
            case 2:
                if (!y(t11, i10)) {
                }
                i1.N(t10, jR, i1.y(t11, jR));
                e0(t10, i10);
                break;
            case 3:
                if (!y(t11, i10)) {
                }
                i1.N(t10, jR, i1.y(t11, jR));
                e0(t10, i10);
                break;
            case 4:
                if (!y(t11, i10)) {
                }
                i1.M(t10, jR, i1.x(t11, jR));
                e0(t10, i10);
                break;
            case 5:
                if (!y(t11, i10)) {
                }
                i1.N(t10, jR, i1.y(t11, jR));
                e0(t10, i10);
                break;
            case 6:
                if (!y(t11, i10)) {
                }
                i1.M(t10, jR, i1.x(t11, jR));
                e0(t10, i10);
                break;
            case 7:
                if (y(t11, i10)) {
                    i1.E(t10, jR, i1.p(t11, jR));
                    e0(t10, i10);
                }
                break;
            case 8:
                if (!y(t11, i10)) {
                }
                i1.O(t10, jR, i1.A(t11, jR));
                e0(t10, i10);
                break;
            case 9:
            case 17:
                K(t10, t11, i10);
                break;
            case 10:
                if (!y(t11, i10)) {
                }
                i1.O(t10, jR, i1.A(t11, jR));
                e0(t10, i10);
                break;
            case 11:
                if (!y(t11, i10)) {
                }
                i1.M(t10, jR, i1.x(t11, jR));
                e0(t10, i10);
                break;
            case 12:
                if (!y(t11, i10)) {
                }
                i1.M(t10, jR, i1.x(t11, jR));
                e0(t10, i10);
                break;
            case 13:
                if (!y(t11, i10)) {
                }
                i1.M(t10, jR, i1.x(t11, jR));
                e0(t10, i10);
                break;
            case 14:
                if (!y(t11, i10)) {
                }
                i1.N(t10, jR, i1.y(t11, jR));
                e0(t10, i10);
                break;
            case 15:
                if (!y(t11, i10)) {
                }
                i1.M(t10, jR, i1.x(t11, jR));
                e0(t10, i10);
                break;
            case 16:
                if (!y(t11, i10)) {
                }
                i1.N(t10, jR, i1.y(t11, jR));
                e0(t10, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case 31:
            case 32:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                this.f3724n.d(t10, t11, jR);
                break;
            case 50:
                b1.F(this.f3727q, t10, t11, jR);
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (!E(t11, iQ, i10)) {
                }
                i1.O(t10, jR, i1.A(t11, jR));
                f0(t10, iQ, i10);
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                L(t10, t11, i10);
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (!E(t11, iQ, i10)) {
                }
                i1.O(t10, jR, i1.A(t11, jR));
                f0(t10, iQ, i10);
                break;
        }
    }

    static <T> p0<T> N(Class<T> cls, l0 l0Var, r0 r0Var, d0 d0Var, f1<?, ?> f1Var, p<?> pVar, i0 i0Var) {
        return l0Var instanceof x0 ? P((x0) l0Var, r0Var, d0Var, f1Var, pVar, i0Var) : O((d1) l0Var, r0Var, d0Var, f1Var, pVar, i0Var);
    }

    static <T> p0<T> O(d1 d1Var, r0 r0Var, d0 d0Var, f1<?, ?> f1Var, p<?> pVar, i0 i0Var) {
        boolean z10 = d1Var.c() == e4.g.PROTO3;
        s[] sVarArrE = d1Var.e();
        if (sVarArrE.length != 0) {
            s sVar = sVarArrE[0];
            throw null;
        }
        int length = sVarArrE.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (sVarArrE.length > 0) {
            s sVar2 = sVarArrE[0];
            throw null;
        }
        int[] iArrD = d1Var.d();
        if (iArrD == null) {
            iArrD = f3709r;
        }
        if (sVarArrE.length > 0) {
            s sVar3 = sVarArrE[0];
            throw null;
        }
        int[] iArr2 = f3709r;
        int[] iArr3 = f3709r;
        int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
        System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
        return new p0<>(iArr, objArr, 0, 0, d1Var.b(), z10, true, iArr4, iArrD.length, iArrD.length + iArr2.length, r0Var, d0Var, f1Var, pVar, i0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> androidx.datastore.preferences.protobuf.p0<T> P(androidx.datastore.preferences.protobuf.x0 r36, androidx.datastore.preferences.protobuf.r0 r37, androidx.datastore.preferences.protobuf.d0 r38, androidx.datastore.preferences.protobuf.f1<?, ?> r39, androidx.datastore.preferences.protobuf.p<?> r40, androidx.datastore.preferences.protobuf.i0 r41) {
        /*
            Method dump skipped, instruction units count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.P(androidx.datastore.preferences.protobuf.x0, androidx.datastore.preferences.protobuf.r0, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.i0):androidx.datastore.preferences.protobuf.p0");
    }

    private int Q(int i10) {
        return this.f3711a[i10];
    }

    private static long R(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean S(T t10, long j10) {
        return ((Boolean) i1.A(t10, j10)).booleanValue();
    }

    private static <T> double T(T t10, long j10) {
        return ((Double) i1.A(t10, j10)).doubleValue();
    }

    private static <T> float U(T t10, long j10) {
        return ((Float) i1.A(t10, j10)).floatValue();
    }

    private static <T> int V(T t10, long j10) {
        return ((Integer) i1.A(t10, j10)).intValue();
    }

    private static <T> long W(T t10, long j10) {
        return ((Long) i1.A(t10, j10)).longValue();
    }

    private int X(int i10) {
        if (i10 < this.f3713c || i10 > this.f3714d) {
            return -1;
        }
        return g0(i10, 0);
    }

    private int Y(int i10) {
        return this.f3711a[i10 + 2];
    }

    private <E> void Z(Object obj, long j10, y0 y0Var, z0<E> z0Var, o oVar) {
        y0Var.G(this.f3724n.e(obj, j10), z0Var, oVar);
    }

    private <E> void a0(Object obj, int i10, y0 y0Var, z0<E> z0Var, o oVar) {
        y0Var.L(this.f3724n.e(obj, R(i10)), z0Var, oVar);
    }

    private void b0(Object obj, int i10, y0 y0Var) {
        long jR;
        Object objD;
        if (x(i10)) {
            jR = R(i10);
            objD = y0Var.N();
        } else if (this.f3717g) {
            jR = R(i10);
            objD = y0Var.z();
        } else {
            jR = R(i10);
            objD = y0Var.D();
        }
        i1.O(obj, jR, objD);
    }

    private void c0(Object obj, int i10, y0 y0Var) {
        if (x(i10)) {
            y0Var.C(this.f3724n.e(obj, R(i10)));
        } else {
            y0Var.B(this.f3724n.e(obj, R(i10)));
        }
    }

    private static Field d0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(T t10, int i10) {
        if (this.f3718h) {
            return;
        }
        int iY = Y(i10);
        long j10 = iY & 1048575;
        i1.M(t10, j10, i1.x(t10, j10) | (1 << (iY >>> 20)));
    }

    private void f0(T t10, int i10, int i11) {
        i1.M(t10, Y(i11) & 1048575, i10);
    }

    private int g0(int i10, int i11) {
        int length = (this.f3711a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iQ = Q(i13);
            if (i10 == iQ) {
                return i13;
            }
            if (i10 < iQ) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int h0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int i0(int i10) {
        return this.f3711a[i10 + 1];
    }

    private boolean j(T t10, T t11, int i10) {
        return y(t10, i10) == y(t11, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j0(T r18, androidx.datastore.preferences.protobuf.l1 r19) {
        /*
            Method dump skipped, instruction units count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.j0(java.lang.Object, androidx.datastore.preferences.protobuf.l1):void");
    }

    private static <T> boolean k(T t10, long j10) {
        return i1.p(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void k0(T r13, androidx.datastore.preferences.protobuf.l1 r14) {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.k0(java.lang.Object, androidx.datastore.preferences.protobuf.l1):void");
    }

    private static <T> double l(T t10, long j10) {
        return i1.v(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l0(T r11, androidx.datastore.preferences.protobuf.l1 r12) {
        /*
            Method dump skipped, instruction units count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.l0(java.lang.Object, androidx.datastore.preferences.protobuf.l1):void");
    }

    private boolean m(T t10, T t11, int i10) {
        int iI0 = i0(i10);
        long jR = R(iI0);
        switch (h0(iI0)) {
            case 0:
                if (j(t10, t11, i10) && Double.doubleToLongBits(i1.v(t10, jR)) == Double.doubleToLongBits(i1.v(t11, jR))) {
                    break;
                }
                break;
            case 1:
                if (j(t10, t11, i10) && Float.floatToIntBits(i1.w(t10, jR)) == Float.floatToIntBits(i1.w(t11, jR))) {
                    break;
                }
                break;
            case 2:
                if (j(t10, t11, i10) && i1.y(t10, jR) == i1.y(t11, jR)) {
                    break;
                }
                break;
            case 3:
                if (j(t10, t11, i10) && i1.y(t10, jR) == i1.y(t11, jR)) {
                    break;
                }
                break;
            case 4:
                if (j(t10, t11, i10) && i1.x(t10, jR) == i1.x(t11, jR)) {
                    break;
                }
                break;
            case 5:
                if (j(t10, t11, i10) && i1.y(t10, jR) == i1.y(t11, jR)) {
                    break;
                }
                break;
            case 6:
                if (j(t10, t11, i10) && i1.x(t10, jR) == i1.x(t11, jR)) {
                    break;
                }
                break;
            case 7:
                if (j(t10, t11, i10) && i1.p(t10, jR) == i1.p(t11, jR)) {
                    break;
                }
                break;
            case 8:
                if (j(t10, t11, i10) && b1.K(i1.A(t10, jR), i1.A(t11, jR))) {
                    break;
                }
                break;
            case 9:
                if (j(t10, t11, i10) && b1.K(i1.A(t10, jR), i1.A(t11, jR))) {
                    break;
                }
                break;
            case 10:
                if (j(t10, t11, i10) && b1.K(i1.A(t10, jR), i1.A(t11, jR))) {
                    break;
                }
                break;
            case 11:
                if (j(t10, t11, i10) && i1.x(t10, jR) == i1.x(t11, jR)) {
                    break;
                }
                break;
            case 12:
                if (j(t10, t11, i10) && i1.x(t10, jR) == i1.x(t11, jR)) {
                    break;
                }
                break;
            case 13:
                if (j(t10, t11, i10) && i1.x(t10, jR) == i1.x(t11, jR)) {
                    break;
                }
                break;
            case 14:
                if (j(t10, t11, i10) && i1.y(t10, jR) == i1.y(t11, jR)) {
                    break;
                }
                break;
            case 15:
                if (j(t10, t11, i10) && i1.x(t10, jR) == i1.x(t11, jR)) {
                    break;
                }
                break;
            case 16:
                if (j(t10, t11, i10) && i1.y(t10, jR) == i1.y(t11, jR)) {
                    break;
                }
                break;
            case 17:
                if (j(t10, t11, i10) && b1.K(i1.A(t10, jR), i1.A(t11, jR))) {
                    break;
                }
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (D(t10, t11, i10) && b1.K(i1.A(t10, jR), i1.A(t11, jR))) {
                    break;
                }
                break;
        }
        return true;
    }

    private <K, V> void m0(l1 l1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            l1Var.L(i10, this.f3727q.c(r(i11)), this.f3727q.h(obj));
        }
    }

    private final <UT, UB> UB n(Object obj, int i10, UB ub2, f1<UT, UB> f1Var) {
        y.e eVarQ;
        int iQ = Q(i10);
        Object objA = i1.A(obj, R(i0(i10)));
        return (objA == null || (eVarQ = q(i10)) == null) ? ub2 : (UB) o(i10, iQ, this.f3727q.d(objA), eVarQ, ub2, f1Var);
    }

    private void n0(int i10, Object obj, l1 l1Var) {
        if (obj instanceof String) {
            l1Var.m(i10, (String) obj);
        } else {
            l1Var.w(i10, (g) obj);
        }
    }

    private final <K, V, UT, UB> UB o(int i10, int i11, Map<K, V> map, y.e eVar, UB ub2, f1<UT, UB> f1Var) {
        g0.a<?, ?> aVarC = this.f3727q.c(r(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = f1Var.n();
                }
                g.h hVarU = g.u(g0.b(aVarC, next.getKey(), next.getValue()));
                try {
                    g0.e(hVarU.b(), aVarC, next.getKey(), next.getValue());
                    f1Var.d(ub2, i11, hVarU.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private <UT, UB> void o0(f1<UT, UB> f1Var, T t10, l1 l1Var) {
        f1Var.t(f1Var.g(t10), l1Var);
    }

    private static <T> float p(T t10, long j10) {
        return i1.w(t10, j10);
    }

    private y.e q(int i10) {
        return (y.e) this.f3712b[((i10 / 3) * 2) + 1];
    }

    private Object r(int i10) {
        return this.f3712b[(i10 / 3) * 2];
    }

    private z0 s(int i10) {
        int i11 = (i10 / 3) * 2;
        z0 z0Var = (z0) this.f3712b[i11];
        if (z0Var != null) {
            return z0Var;
        }
        z0<T> z0VarD = v0.a().d((Class) this.f3712b[i11 + 1]);
        this.f3712b[i11] = z0VarD;
        return z0VarD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0320, code lost:
    
        if ((r7 & r14) != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0322, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.j.s(r9, (androidx.datastore.preferences.protobuf.n0) r2.getObject(r18, r12), s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x034d, code lost:
    
        if ((r7 & r14) != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x034f, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.j.N(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0356, code lost:
    
        if ((r7 & r14) != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0358, code lost:
    
        r4 = androidx.datastore.preferences.protobuf.j.L(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x037b, code lost:
    
        if ((r7 & r14) != 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x037d, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.j.g(r9, (androidx.datastore.preferences.protobuf.g) r2.getObject(r18, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x038a, code lost:
    
        if ((r7 & r14) != 0) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x038c, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.b1.o(r9, r2.getObject(r18, r12), s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b7, code lost:
    
        if ((r7 & r14) != 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03b9, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.j.d(r9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (E(r18, r9, r5) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (E(r18, r9, r5) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        if (E(r18, r9, r5) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        if (E(r18, r9, r5) != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
    
        if (E(r18, r9, r5) != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00df, code lost:
    
        if (E(r18, r9, r5) != false) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025a A[PHI: r3
  0x025a: PHI (r3v120 int) = 
  (r3v83 int)
  (r3v86 int)
  (r3v89 int)
  (r3v92 int)
  (r3v95 int)
  (r3v98 int)
  (r3v101 int)
  (r3v104 int)
  (r3v107 int)
  (r3v110 int)
  (r3v113 int)
  (r3v116 int)
  (r3v119 int)
  (r3v124 int)
 binds: [B:150:0x0258, B:145:0x0247, B:140:0x0236, B:135:0x0225, B:130:0x0214, B:125:0x0203, B:120:0x01f2, B:115:0x01e0, B:110:0x01ce, B:105:0x01bc, B:100:0x01aa, B:95:0x0198, B:90:0x0186, B:85:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int t(T r18) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.t(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0210 A[PHI: r7
  0x0210: PHI (r7v42 int) = 
  (r7v5 int)
  (r7v8 int)
  (r7v11 int)
  (r7v14 int)
  (r7v17 int)
  (r7v20 int)
  (r7v23 int)
  (r7v26 int)
  (r7v29 int)
  (r7v32 int)
  (r7v35 int)
  (r7v38 int)
  (r7v41 int)
  (r7v46 int)
 binds: [B:141:0x020e, B:136:0x01fd, B:131:0x01ec, B:126:0x01db, B:121:0x01ca, B:116:0x01b9, B:111:0x01a8, B:106:0x0196, B:101:0x0184, B:96:0x0172, B:91:0x0160, B:86:0x014e, B:81:0x013c, B:76:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x030d A[PHI: r6
  0x030d: PHI (r6v97 java.lang.Object) = (r6v19 java.lang.Object), (r6v93 java.lang.Object), (r6v100 java.lang.Object) binds: [B:193:0x0334, B:44:0x00a6, B:185:0x0309] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[PHI: r6
  0x00aa: PHI (r6v89 java.lang.Object) = (r6v19 java.lang.Object), (r6v93 java.lang.Object) binds: [B:193:0x0334, B:44:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int u(T r16) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.u(java.lang.Object):int");
    }

    private <UT, UB> int v(f1<UT, UB> f1Var, T t10) {
        return f1Var.h(f1Var.g(t10));
    }

    private static <T> int w(T t10, long j10) {
        return i1.x(t10, j10);
    }

    private static boolean x(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean y(T t10, int i10) {
        if (!this.f3718h) {
            int iY = Y(i10);
            return (i1.x(t10, (long) (iY & 1048575)) & (1 << (iY >>> 20))) != 0;
        }
        int iI0 = i0(i10);
        long jR = R(iI0);
        switch (h0(iI0)) {
            case 0:
                return i1.v(t10, jR) != 0.0d;
            case 1:
                return i1.w(t10, jR) != 0.0f;
            case 2:
                return i1.y(t10, jR) != 0;
            case 3:
                return i1.y(t10, jR) != 0;
            case 4:
                return i1.x(t10, jR) != 0;
            case 5:
                return i1.y(t10, jR) != 0;
            case 6:
                return i1.x(t10, jR) != 0;
            case 7:
                return i1.p(t10, jR);
            case 8:
                Object objA = i1.A(t10, jR);
                if (objA instanceof String) {
                    return !((String) objA).isEmpty();
                }
                if (objA instanceof g) {
                    return !g.f3561b.equals(objA);
                }
                throw new IllegalArgumentException();
            case 9:
                return i1.A(t10, jR) != null;
            case 10:
                return !g.f3561b.equals(i1.A(t10, jR));
            case 11:
                return i1.x(t10, jR) != 0;
            case 12:
                return i1.x(t10, jR) != 0;
            case 13:
                return i1.x(t10, jR) != 0;
            case 14:
                return i1.y(t10, jR) != 0;
            case 15:
                return i1.x(t10, jR) != 0;
            case 16:
                return i1.y(t10, jR) != 0;
            case 17:
                return i1.A(t10, jR) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean z(T t10, int i10, int i11, int i12) {
        return this.f3718h ? y(t10, i10) : (i11 & i12) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public void a(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f3711a.length; i10 += 3) {
            M(t10, t11, i10);
        }
        if (this.f3718h) {
            return;
        }
        b1.G(this.f3725o, t10, t11);
        if (this.f3716f) {
            b1.E(this.f3726p, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public void b(T t10, y0 y0Var, o oVar) {
        oVar.getClass();
        I(this.f3725o, this.f3726p, t10, y0Var, oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public void c(T t10) {
        int i10;
        int i11 = this.f3721k;
        while (true) {
            i10 = this.f3722l;
            if (i11 >= i10) {
                break;
            }
            long jR = R(i0(this.f3720j[i11]));
            Object objA = i1.A(t10, jR);
            if (objA != null) {
                i1.O(t10, jR, this.f3727q.b(objA));
            }
            i11++;
        }
        int length = this.f3720j.length;
        while (i10 < length) {
            this.f3724n.c(t10, this.f3720j[i10]);
            i10++;
        }
        this.f3725o.j(t10);
        if (this.f3716f) {
            this.f3726p.f(t10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // androidx.datastore.preferences.protobuf.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(T r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = -1
            r2 = r0
            r3 = r2
        L4:
            int r4 = r12.f3721k
            r5 = 1
            if (r2 >= r4) goto L94
            int[] r4 = r12.f3720j
            r4 = r4[r2]
            int r6 = r12.Q(r4)
            int r7 = r12.i0(r4)
            boolean r8 = r12.f3718h
            if (r8 != 0) goto L31
            int[] r8 = r12.f3711a
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r5 = r5 << r8
            if (r9 == r1) goto L32
            sun.misc.Unsafe r1 = androidx.datastore.preferences.protobuf.p0.f3710s
            long r10 = (long) r9
            int r3 = r1.getInt(r13, r10)
            r1 = r9
            goto L32
        L31:
            r5 = r0
        L32:
            boolean r8 = F(r7)
            if (r8 == 0) goto L3f
            boolean r8 = r12.z(r13, r4, r3, r5)
            if (r8 != 0) goto L3f
            return r0
        L3f:
            int r8 = h0(r7)
            r9 = 9
            if (r8 == r9) goto L7f
            r9 = 17
            if (r8 == r9) goto L7f
            r5 = 27
            if (r8 == r5) goto L78
            r5 = 60
            if (r8 == r5) goto L67
            r5 = 68
            if (r8 == r5) goto L67
            r5 = 49
            if (r8 == r5) goto L78
            r5 = 50
            if (r8 == r5) goto L60
            goto L90
        L60:
            boolean r4 = r12.C(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L67:
            boolean r5 = r12.E(r13, r6, r4)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.z0 r4 = r12.s(r4)
            boolean r4 = A(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L78:
            boolean r4 = r12.B(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L7f:
            boolean r5 = r12.z(r13, r4, r3, r5)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.z0 r4 = r12.s(r4)
            boolean r4 = A(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L90:
            int r2 = r2 + 1
            goto L4
        L94:
            boolean r1 = r12.f3716f
            if (r1 == 0) goto La5
            androidx.datastore.preferences.protobuf.p<?> r1 = r12.f3726p
            androidx.datastore.preferences.protobuf.t r13 = r1.c(r13)
            boolean r13 = r13.p()
            if (r13 != 0) goto La5
            return r0
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.d(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public void e(T t10, l1 l1Var) {
        if (l1Var.i() == l1.a.DESCENDING) {
            l0(t10, l1Var);
        } else if (this.f3718h) {
            k0(t10, l1Var);
        } else {
            j0(t10, l1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public boolean f(T t10, T t11) {
        int length = this.f3711a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f3725o.g(t10).equals(this.f3725o.g(t11))) {
            return false;
        }
        if (this.f3716f) {
            return this.f3726p.c(t10).equals(this.f3726p.c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public int g(T t10) {
        return this.f3718h ? u(t10) : t(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public T h() {
        return (T) this.f3723m.a(this.f3715e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0 A[PHI: r3
  0x00e0: PHI (r3v12 java.lang.Object) = (r3v10 java.lang.Object), (r3v13 java.lang.Object) binds: [B:67:0x00de, B:62:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int i(T r9) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.i(java.lang.Object):int");
    }
}
