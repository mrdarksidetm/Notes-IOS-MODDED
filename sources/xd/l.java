package xd;

import ae.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class l implements ie.g<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f23138a;

    public static final class a implements Iterator<String>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23140b;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f23139a;
            this.f23139a = null;
            r.c(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f23139a == null && !this.f23140b) {
                String line = l.this.f23138a.readLine();
                this.f23139a = line;
                if (line == null) {
                    this.f23140b = true;
                }
            }
            return this.f23139a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(BufferedReader bufferedReader) {
        r.f(bufferedReader, "reader");
        this.f23138a = bufferedReader;
    }

    @Override // ie.g
    public Iterator<String> iterator() {
        return new a();
    }
}
