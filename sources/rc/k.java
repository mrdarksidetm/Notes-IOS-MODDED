package rc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.j f19286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f19287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j.c f19288c;

    class a implements j.c {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x0143 A[Catch: JSONException -> 0x024c, TryCatch #11 {JSONException -> 0x024c, blocks: (B:6:0x002c, B:7:0x0030, B:56:0x00db, B:57:0x00e0, B:58:0x00eb, B:59:0x00f0, B:60:0x0109, B:61:0x0119, B:63:0x011d, B:67:0x0137, B:69:0x0143, B:65:0x0122, B:70:0x0150, B:71:0x015a, B:80:0x018c, B:81:0x0197, B:109:0x0218, B:114:0x0232, B:78:0x0183, B:79:0x0187, B:88:0x01bb, B:95:0x01d9, B:100:0x01f5, B:107:0x0212, B:112:0x022c, B:117:0x0246, B:9:0x0035, B:12:0x0040, B:15:0x004b, B:18:0x0057, B:21:0x0063, B:24:0x006e, B:27:0x0079, B:30:0x0083, B:33:0x008d, B:36:0x0097, B:39:0x00a1, B:42:0x00ab, B:45:0x00b6, B:48:0x00c1, B:51:0x00cc, B:97:0x01de), top: B:130:0x002c, inners: #1, #2, #5, #8 }] */
        @Override // sc.j.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onMethodCall(sc.i r6, sc.j.d r7) {
            /*
                Method dump skipped, instruction units count: 710
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.k.a.onMethodCall(sc.i, sc.j$d):void");
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f19291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f19292c;

        static {
            int[] iArr = new int[EnumC0406k.values().length];
            f19292c = iArr;
            try {
                iArr[EnumC0406k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19292c[EnumC0406k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19292c[EnumC0406k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19292c[EnumC0406k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            f19291b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19291b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            f19290a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19290a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19290a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19290a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19294b;

        public c(int i10, String str) {
            this.f19293a = i10;
            this.f19294b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19298a;

        d(String str) {
            this.f19298a = str;
        }

        static d b(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f19298a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19301a;

        e(String str) {
            this.f19301a = str;
        }

        static e b(String str) throws NoSuchFieldException {
            for (e eVar : values()) {
                if (eVar.f19301a.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19307a;

        f(String str) {
            this.f19307a = str;
        }

        static f b(String str) throws NoSuchFieldException {
            for (f fVar : values()) {
                if (fVar.f19307a.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19314a;

        g(String str) {
            this.f19314a = str;
        }

        static g b(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                String str2 = gVar.f19314a;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        void a();

        default void f(boolean z10) {
        }

        void g(c cVar);

        void h(List<l> list);

        void i(j jVar);

        void j(i iVar);

        void k(String str);

        void l(String str);

        void m(EnumC0406k enumC0406k);

        void n(g gVar);

        void o();

        CharSequence p(e eVar);

        void q();

        void r(int i10);

        boolean s();
    }

    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19318a;

        i(String str) {
            this.f19318a = str;
        }

        static i b(String str) throws NoSuchFieldException {
            for (i iVar : values()) {
                if (iVar.f19318a.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f19319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f19320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f19321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f19322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d f19323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f19324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f19325g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f19319a = num;
            this.f19320b = dVar;
            this.f19321c = bool;
            this.f19322d = num2;
            this.f19323e = dVar2;
            this.f19324f = num3;
            this.f19325g = bool2;
        }
    }

    /* JADX INFO: renamed from: rc.k$k, reason: collision with other inner class name */
    public enum EnumC0406k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19331a;

        EnumC0406k(String str) {
            this.f19331a = str;
        }

        static EnumC0406k b(String str) throws NoSuchFieldException {
            for (EnumC0406k enumC0406k : values()) {
                if (enumC0406k.f19331a.equals(str)) {
                    return enumC0406k;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19335a;

        l(String str) {
            this.f19335a = str;
        }

        static l b(String str) throws NoSuchFieldException {
            for (l lVar : values()) {
                if (lVar.f19335a.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public k(fc.a aVar) {
        a aVar2 = new a();
        this.f19288c = aVar2;
        sc.j jVar = new sc.j(aVar, "flutter/platform", sc.f.f20502a);
        this.f19286a = jVar;
        jVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c g(JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt("primaryColor");
        if (i10 != 0) {
            i10 |= -16777216;
        }
        return new c(i10, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            rc.k$f r4 = rc.k.f.b(r4)
            int[] r8 = rc.k.b.f19290a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.k.h(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j i(JSONObject jSONObject) {
        return new j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.b(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.b(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EnumC0406k j(String str) {
        int i10 = b.f19292c[EnumC0406k.b(str).ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? EnumC0406k.EDGE_TO_EDGE : EnumC0406k.EDGE_TO_EDGE : EnumC0406k.IMMERSIVE_STICKY : EnumC0406k.IMMERSIVE : EnumC0406k.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) throws NoSuchFieldException {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int i11 = b.f19291b[l.b(jSONArray.getString(i10)).ordinal()];
            if (i11 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i11 == 2) {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f19287b = hVar;
    }

    public void m(boolean z10) {
        cc.b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f19286a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z10)));
    }
}
