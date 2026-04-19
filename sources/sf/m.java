package sf;

import java.util.List;
import uf.x;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<vf.g> f20602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private vf.g f20605d = vf.g.c("", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20606e = 0;

    m(List<vf.g> list, int i10, int i11) {
        this.f20602a = list;
        this.f20603b = i10;
        this.f20604c = i11;
        if (list.isEmpty()) {
            return;
        }
        a(i10, i11);
        p(list.get(i10));
    }

    private void a(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f20602a.size()) {
            throw new IllegalArgumentException("Line index " + i10 + " out of range, number of lines: " + this.f20602a.size());
        }
        vf.g gVar = this.f20602a.get(i10);
        if (i11 < 0 || i11 > gVar.a().length()) {
            throw new IllegalArgumentException("Index " + i11 + " out of range, line length: " + gVar.a().length());
        }
    }

    public static m k(vf.h hVar) {
        return new m(hVar.d(), 0, 0);
    }

    private void p(vf.g gVar) {
        this.f20605d = gVar;
        this.f20606e = gVar.a().length();
    }

    public int b(char c10) {
        int i10 = 0;
        while (true) {
            char cL = l();
            if (cL == 0) {
                return -1;
            }
            if (cL == c10) {
                return i10;
            }
            i10++;
            h();
        }
    }

    public int c(tf.b bVar) {
        int i10 = 0;
        while (true) {
            char cL = l();
            if (cL == 0) {
                return -1;
            }
            if (bVar.a(cL)) {
                return i10;
            }
            i10++;
            h();
        }
    }

    public vf.h d(l lVar, l lVar2) {
        int i10 = lVar.f20600a;
        if (i10 == lVar2.f20600a) {
            vf.g gVar = this.f20602a.get(i10);
            CharSequence charSequenceSubSequence = gVar.a().subSequence(lVar.f20601b, lVar2.f20601b);
            x xVarB = gVar.b();
            return vf.h.h(vf.g.c(charSequenceSubSequence, xVarB != null ? x.d(xVarB.c(), xVarB.a() + lVar.f20601b, charSequenceSubSequence.length()) : null));
        }
        vf.h hVarB = vf.h.b();
        vf.g gVar2 = this.f20602a.get(lVar.f20600a);
        hVarB.a(gVar2.d(lVar.f20601b, gVar2.a().length()));
        int i11 = lVar.f20600a;
        while (true) {
            i11++;
            int i12 = lVar2.f20600a;
            if (i11 >= i12) {
                hVarB.a(this.f20602a.get(i12).d(0, lVar2.f20601b));
                return hVarB;
            }
            hVarB.a(this.f20602a.get(i11));
        }
    }

    public boolean e() {
        return this.f20604c < this.f20606e || this.f20603b < this.f20602a.size() - 1;
    }

    public int f(tf.b bVar) {
        int i10 = 0;
        while (bVar.a(l())) {
            i10++;
            h();
        }
        return i10;
    }

    public int g(char c10) {
        int i10 = 0;
        while (l() == c10) {
            i10++;
            h();
        }
        return i10;
    }

    public void h() {
        int i10 = this.f20604c + 1;
        this.f20604c = i10;
        if (i10 > this.f20606e) {
            int i11 = this.f20603b + 1;
            this.f20603b = i11;
            p(i11 < this.f20602a.size() ? this.f20602a.get(this.f20603b) : vf.g.c("", null));
            this.f20604c = 0;
        }
    }

    public boolean i(char c10) {
        if (l() != c10) {
            return false;
        }
        h();
        return true;
    }

    public boolean j(String str) {
        int i10 = this.f20604c;
        if (i10 >= this.f20606e || i10 + str.length() > this.f20606e) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (this.f20605d.a().charAt(this.f20604c + i11) != str.charAt(i11)) {
                return false;
            }
        }
        this.f20604c += str.length();
        return true;
    }

    public char l() {
        return this.f20604c < this.f20606e ? this.f20605d.a().charAt(this.f20604c) : this.f20603b < this.f20602a.size() + (-1) ? '\n' : (char) 0;
    }

    public int m() {
        if (this.f20604c >= this.f20606e) {
            return this.f20603b < this.f20602a.size() + (-1) ? 10 : 0;
        }
        char cCharAt = this.f20605d.a().charAt(this.f20604c);
        if (!Character.isHighSurrogate(cCharAt) || this.f20604c + 1 >= this.f20606e) {
            return cCharAt;
        }
        char cCharAt2 = this.f20605d.a().charAt(this.f20604c + 1);
        return Character.isLowSurrogate(cCharAt2) ? Character.toCodePoint(cCharAt, cCharAt2) : cCharAt;
    }

    public int n() {
        int i10 = this.f20604c;
        if (i10 <= 0) {
            return this.f20603b > 0 ? 10 : 0;
        }
        int i11 = i10 - 1;
        char cCharAt = this.f20605d.a().charAt(i11);
        if (Character.isLowSurrogate(cCharAt) && i11 > 0) {
            char cCharAt2 = this.f20605d.a().charAt(i11 - 1);
            if (Character.isHighSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    public l o() {
        return new l(this.f20603b, this.f20604c);
    }

    public void q(l lVar) {
        a(lVar.f20600a, lVar.f20601b);
        int i10 = lVar.f20600a;
        this.f20603b = i10;
        this.f20604c = lVar.f20601b;
        p(this.f20602a.get(i10));
    }

    public int r() {
        int i10 = 0;
        while (true) {
            char cL = l();
            if (cL != ' ') {
                switch (cL) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i10;
                }
            }
            i10++;
            h();
        }
    }
}
