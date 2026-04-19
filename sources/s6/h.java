package s6;

import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f20098a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f20116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f20117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f20118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f20119g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f20120h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f20121i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f20122j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20123k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f20100m = f1.a("54341A5EAC2D4B4E96");

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f20101n = f1.b(f1.c("18341D67AA6C4C51911D53523E"));

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f20102o = f1.b(f1.c("0D64"));

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f20103p = f1.b(f1.c("5A2B0B6DA56341408911"));

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f20104q = f1.b(f1.c("4121016CA631704880"));

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f20105r = f1.b(f1.c("7F251D6CBE225D44"));

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f20106s = f1.b(f1.c("4736006CBC205B"));

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f20107t = f1.b(f1.c("5F251D6CBE225D44"));

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f20108u = f1.b(f1.c("552B0E7AAD"));

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f20109v = f1.b(f1.c("54341A49AB2A"));

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f20110w = f1.b(f1.c("53211961AA26"));

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f20111x = f1.b(f1.c("5A2B0B6DA5"));

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f20112y = f1.b(f1.c("4521036DA8304A"));

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final C0413a f20099l = new C0413a();

        /* JADX INFO: renamed from: s6.h$a$a, reason: collision with other inner class name */
        public static final class C0413a {
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.f20113a = str;
            this.f20114b = str2;
            this.f20115c = str3;
            this.f20116d = str4;
            this.f20117e = str5;
            this.f20118f = str6;
            this.f20119g = str7;
            this.f20120h = str8;
            this.f20121i = str9;
            this.f20122j = c();
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, ae.j jVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) == 0 ? str9 : null);
        }

        public final boolean a() {
            String str = this.f20113a;
            if (str != null && j(str)) {
                this.f20123k++;
            }
            String str2 = this.f20114b;
            if (str2 != null && h(str2)) {
                this.f20123k++;
            }
            String str3 = this.f20115c;
            if (str3 != null && b(str3)) {
                this.f20123k++;
            }
            String str4 = this.f20116d;
            if (str4 != null && d(str4)) {
                this.f20123k++;
            }
            String str5 = this.f20117e;
            if (str5 != null && f(str5)) {
                this.f20123k++;
            }
            String str6 = this.f20118f;
            if (str6 != null && i(str6)) {
                this.f20123k++;
            }
            String str7 = this.f20119g;
            if (str7 != null && k(str7)) {
                this.f20123k++;
            }
            String str8 = this.f20120h;
            if (str8 != null && e(str8)) {
                this.f20123k++;
            }
            return this.f20123k == this.f20122j;
        }

        public final boolean b(String str) {
            try {
                String str2 = Build.BOARD;
                if (str2 != null) {
                    return je.w.L(str2, str, false, 2, null);
                }
            } catch (NoSuchFieldError unused) {
                f1.a("792B3C7DAA2B694881185971237F1320");
                f1.b(f1.c("72361D67BB6358498D185814306E1F37EC1143417B50107D59B57F344AB9CD5D73640961AC2F4B"));
            }
            return false;
        }

        public final int c() {
            int i10 = this.f20113a != null ? 1 : 0;
            if (this.f20114b != null) {
                i10++;
            }
            if (this.f20115c != null) {
                i10++;
            }
            if (this.f20116d != null) {
                i10++;
            }
            if (this.f20117e != null) {
                i10++;
            }
            if (this.f20118f != null) {
                i10++;
            }
            if (this.f20119g != null) {
                i10++;
            }
            return this.f20120h != null ? i10 + 1 : i10;
        }

        public final boolean d(String str) {
            try {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr != null) {
                    return nd.p.F(strArr, str);
                }
                return false;
            } catch (NoSuchFieldError unused) {
                f1.a("792B3C7DAA2B694881185971237F1320");
                f1.b(f1.c("72361D67BB6358498D185814306E1F37EC1143417B50107D59B57F345BA3DC5F78163B4D8D1C6E63AD271D5238681036"));
                return false;
            }
        }

        public final boolean e(String str) {
            Map<String, String> mapG = g();
            String str2 = mapG.get(f1.a("7F251D6CBE225D44"));
            if (str2 != null && je.w.L(str2, str, false, 2, null)) {
                return true;
            }
            String str3 = mapG.get(f1.b(f1.c("5A2B0B6DA56341408911")));
            if (str3 != null && je.w.L(str3, str, false, 2, null)) {
                return true;
            }
            String str4 = mapG.get(f1.b(f1.c("4121016CA631704880")));
            return str4 != null && je.w.L(str4, str, false, 2, null);
        }

        public final boolean f(String str) {
            try {
                return ae.r.b(str, Build.DEVICE);
            } catch (NoSuchFieldError unused) {
                f1.a("792B3C7DAA2B694881185971237F1320");
                f1.b(f1.c("72361D67BB6358498D185814306E1F37EC1143417B50107D59B57F344CB3DA4674014F6EA0264345"));
                return false;
            }
        }

        public final Map<String, String> g() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                Scanner scanner = new Scanner(new File(f1.a("18341D67AA6C4C51911D53523E")));
                while (scanner.hasNextLine()) {
                    String strNextLine = scanner.nextLine();
                    ae.r.e(strNextLine, f1.b(f1.c("446A016DB13763488A11151D")));
                    List listC0 = je.w.C0(strNextLine, new String[]{f1.b(f1.c("0D64"))}, false, 0, 6, null);
                    if (listC0.size() > 1) {
                        String str = (String) listC0.get(0);
                        int length = str.length() - 1;
                        int i10 = 0;
                        boolean z10 = false;
                        while (i10 <= length) {
                            boolean z11 = ae.r.g(str.charAt(!z10 ? i10 : length), 32) <= 0;
                            if (z10) {
                                if (!z11) {
                                    break;
                                }
                                length--;
                            } else if (z11) {
                                i10++;
                            } else {
                                z10 = true;
                            }
                        }
                        String string = str.subSequence(i10, length + 1).toString();
                        String str2 = (String) listC0.get(1);
                        int length2 = str2.length() - 1;
                        int i11 = 0;
                        boolean z12 = false;
                        while (i11 <= length2) {
                            boolean z13 = ae.r.g(str2.charAt(!z12 ? i11 : length2), 32) <= 0;
                            if (z12) {
                                if (!z13) {
                                    break;
                                }
                                length2--;
                            } else if (z13) {
                                i11++;
                            } else {
                                z12 = true;
                            }
                        }
                        linkedHashMap.put(string, str2.subSequence(i11, length2 + 1).toString());
                    }
                }
            } catch (Exception unused) {
            }
            return linkedHashMap;
        }

        public final boolean h(String str) {
            try {
                String str2 = Build.HARDWARE;
                if (str2 != null) {
                    return je.w.L(str2, str, false, 2, null);
                }
            } catch (NoSuchFieldError unused) {
                f1.a("792B3C7DAA2B694881185971237F1320");
                f1.b(f1.c("72361D67BB6358498D185814306E1F37EC1143417B50107D59B57F3440B7DE4B60053D4DE92546448810"));
            }
            return false;
        }

        public final boolean i(String str) {
            try {
                return ae.r.b(str, Build.MODEL);
            } catch (NoSuchFieldError unused) {
                f1.a("792B3C7DAA2B694881185971237F1320");
                f1.b(f1.c("72361D67BB6358498D185814306E1F37EC1143417B50107D59B57F3445B9C84A7B640961AC2F4B"));
                return false;
            }
        }

        public final boolean j(String str) {
            try {
                String str2 = Build.PRODUCT;
                if (str2 != null) {
                    return je.w.L(str2, str, false, 2, null);
                }
            } catch (NoSuchFieldError unused) {
                f1.a("792B3C7DAA2B694881185971237F1320");
                f1.b(f1.c("72361D67BB6358498D185814306E1F37EC1143417B50107D59B57F3458A4C34B62073B28AF2A4A4D80"));
            }
            return false;
        }

        public final boolean k(String str) {
            try {
                return ae.r.b(Build.VERSION.RELEASE, str);
            } catch (NoSuchFieldError unused) {
                f1.a("792B3C7DAA2B694881185971237F1320");
                f1.b(f1.c("72361D67BB6358498D185814306E1F37EC1143417B50107D59B57F345EB3DE5C7E0B21269B066364A52778143764193EFB"));
                return false;
            }
        }

        public final JSONObject l() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.f20113a != null) {
                    jSONObject.put(f1.a("4736006CBC205B"), this.f20113a);
                }
                if (this.f20114b != null) {
                    jSONObject.put(f1.a("5F251D6CBE225D44"), this.f20114b);
                }
                if (this.f20115c != null) {
                    jSONObject.put(f1.a("552B0E7AAD"), this.f20115c);
                }
                if (this.f20116d != null) {
                    jSONObject.put(f1.a("54341A49AB2A"), this.f20116d);
                }
                if (this.f20117e != null) {
                    jSONObject.put(f1.a("53211961AA26"), this.f20117e);
                }
                if (this.f20118f != null) {
                    jSONObject.put(f1.a("5A2B0B6DA5"), this.f20118f);
                }
                if (this.f20119g != null) {
                    jSONObject.put(f1.a("4521036DA8304A"), this.f20119g);
                }
                if (this.f20120h != null) {
                    jSONObject.put(f1.a("54341A5EAC2D4B4E96"), this.f20120h);
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public h() {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        ae.j jVar = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        int i10 = 190;
        int i11 = 159;
        String str13 = null;
        int i12 = 215;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        int i13 = 215;
        String strA = f1.a("46270065");
        String strA2 = f1.a("76311B60AC2D5B4887357070");
        String strA3 = f1.a("422A0B6DAF2A414480");
        String str18 = null;
        String str19 = null;
        int i14 = R.styleable.AppCompatTheme_windowMinWidthMinor;
        ae.j jVar2 = null;
        String strA4 = f1.a("523C1666A630");
        String strA5 = f1.a("7021017DA02D4A688A005858");
        String strA6 = f1.a("422A0B6DAF2A414480");
        String str20 = null;
        int i15 = R.styleable.AppCompatTheme_windowFixedWidthMinor;
        this.f20098a = nd.u.p(new a(null, null, null, str, f1.a("52291A64A8374053"), str2, null, str3, f1.a("792B1728992F4E588106"), 239, null), new a(f1.a("502B006FA5260F718D0C5858713F"), str4, str5, str6, null, str7, f1.a("006A5E26FB"), str8, f1.a("792B1728992F4E588106"), 190, jVar), new a(str9, str4, str5, str6, f1.a("44300E7AFB2F5B44"), str7, f1.a("006A5E26FB"), str8, f1.a("792B1728992F4E588106"), 175, jVar), new a(str9, str4, str5, f1.a("4F7C59"), str10, f1.a("6409424FF0751A6F"), null, str8, f1.a("792B1728992F4E588106"), 215, jVar), new a(f1.a("7B0322259F701F11AF"), str4, str5, str11, str10, str12, f1.a("006A5E26FB"), str8, f1.a("792B1728992F4E588106"), i10, jVar), new a(f1.a("60133041F9731E65"), str4, str5, str11, str10, str12, f1.a("006A5E26FB"), str8, f1.a("792B1728992F4E588106"), i10, jVar), new a(null, str4, str5, str11, str10, f1.a("6409424FF07B1E11"), f1.a("006A5E26FB"), str8, f1.a("792B1728992F4E588106"), i11, jVar), new a(0 == true ? 1 : 0, str4, str5, str11, str10, f1.a("6409424FF0741C6F"), f1.a("006A5E26FB"), str8, f1.a("792B1728992F4E588106"), i11, jVar), new a(0 == true ? 1 : 0, str4, str5, f1.a("4F7C59"), str10, f1.a("6409424FF0761A6F"), str13, str8, f1.a("792B1728992F4E588106"), i12, jVar), new a(0 == true ? 1 : 0, str4, str5, f1.a("4F7C59"), str10, f1.a("6409424FF074196F"), str13, str8, f1.a("792B1728992F4E588106"), i12, jVar), new a(0 == true ? 1 : 0, str4, str5, f1.a("4F7C59"), str10, f1.a("6409424FF074186F"), str13, str8, f1.a("792B1728992F4E588106"), i12, jVar), new a(0 == true ? 1 : 0, str4, str5, f1.a("4F7C59"), str10, f1.a("6409424FF07B176F"), str13, str8, f1.a("792B1728992F4E588106"), i12, jVar), new a(str, str14, str2, f1.a("4F7C59"), str3, f1.a("64094249F1731A6F"), null, 0 == true ? 1 : 0, f1.a("75281A6D9A374E428F07"), 215, null), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("640B4238F809"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("6409424FF0761A67"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("6409424FF07A1763"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("64072838FB"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("6409424FF0741863"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("6409424FF0741C67"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("7C065D38F972"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("780A2A5885167C01A5410D0461"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("780A2A5885167C01A5470D0561"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("7B034240F0701F"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("670D374D85631D01BC38"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(str14, str2, str15, f1.a("4F7C59"), str16, f1.a("76173A5B96191F10B530"), 0 == true ? 1 : 0, str17, f1.a("75281A6D9A374E428F07"), i13, 0 == true ? 1 : 0), new a(null, f1.a("46270065"), str14, str2, str15, null, str16, f1.a("7021017DA02D4A688A005858"), f1.a("422A0B6DAF2A414480"), R.styleable.AppCompatTheme_windowMinWidthMinor, null), new a(str5, strA, str10, str18, str13, str8, str19, strA2, strA3, i14, jVar2), new a(str5, f1.a("523C1666A630"), str10, str18, str13, str8, str19, f1.a("7021017DA02D4A688A005858"), f1.a("422A0B6DAF2A414480"), i14, jVar2), new a(str5, f1.a("523C1666A630"), str10, str18, str13, str8, str19, f1.a("76311B60AC2D5B4887357070"), f1.a("422A0B6DAF2A414480"), i14, jVar2), new a(str5, str20, strA4, str18, str13, str8, str19, strA5, strA6, i15, jVar2), new a(str5, str20, f1.a("523C1666A630"), str18, str13, str8, str19, f1.a("76311B60AC2D5B4887357070"), f1.a("422A0B6DAF2A414480"), i15, jVar2));
    }

    public final List<a> a() {
        List<a> list = this.f20098a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((a) obj).a()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
