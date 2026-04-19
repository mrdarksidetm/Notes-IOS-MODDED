package e7;

import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    static final class a extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10659a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String str = Build.SUPPORTED_ABIS[0];
            ae.r.e(str, "Build.SUPPORTED_ABIS[0]");
            return str;
        }
    }

    static final class b extends ae.s implements zd.a<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10660a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final Integer invoke() {
            return Integer.valueOf(Runtime.getRuntime().availableProcessors());
        }
    }

    static final class c extends ae.s implements zd.a<Map<String, ? extends String>> {
        c() {
            super(0);
        }

        @Override // zd.a
        public final Map<String, ? extends String> invoke() {
            return j.this.g();
        }
    }

    static final class d extends ae.s implements zd.a<h> {
        d() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return j.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> g() {
        HashMap map = new HashMap();
        Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
        while (scanner.hasNextLine()) {
            String strNextLine = scanner.nextLine();
            ae.r.e(strNextLine, "s.nextLine()");
            List listC0 = je.w.C0(strNextLine, new String[]{": "}, false, 0, 6, null);
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
                map.put(string, str2.subSequence(i11, length2 + 1).toString());
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h h() {
        return i7.a.a(xd.i.e(new File("/proc/cpuinfo"), null, 1, null));
    }

    @Override // e7.i
    public h a() {
        return (h) g7.a.a(new d(), h.f10653c.a());
    }

    @Override // e7.i
    public Map<String, String> b() {
        return (Map) g7.a.a(new c(), r0.e());
    }

    @Override // e7.i
    public String c() {
        return (String) g7.a.a(a.f10659a, "");
    }

    @Override // e7.i
    public int d() {
        return ((Number) g7.a.a(b.f10660a, 0)).intValue();
    }
}
