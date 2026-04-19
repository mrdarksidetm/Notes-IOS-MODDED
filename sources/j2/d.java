package j2;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f13825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13828d;

    public d(CharSequence charSequence, int i10, int i11) {
        this.f13825a = charSequence;
        this.f13826b = i10;
        this.f13827c = i11;
        this.f13828d = i10;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f13828d;
        if (i10 == this.f13827c) {
            return (char) 65535;
        }
        return this.f13825a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f13828d = this.f13826b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f13826b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f13827c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f13828d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f13826b;
        int i11 = this.f13827c;
        if (i10 == i11) {
            this.f13828d = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f13828d = i12;
        return this.f13825a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f13828d + 1;
        this.f13828d = i10;
        int i11 = this.f13827c;
        if (i10 < i11) {
            return this.f13825a.charAt(i10);
        }
        this.f13828d = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f13828d;
        if (i10 <= this.f13826b) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f13828d = i11;
        return this.f13825a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.f13826b;
        boolean z10 = false;
        if (i10 <= this.f13827c && i11 <= i10) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f13828d = i10;
        return current();
    }
}
