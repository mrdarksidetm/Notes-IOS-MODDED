package d6;

import a6.o;
import android.webkit.MimeTypeMap;
import d6.i;
import hf.z;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f9510a;

    public static final class a implements i.a<File> {
        @Override // d6.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(File file, j6.m mVar, x5.e eVar) {
            return new j(file);
        }
    }

    public j(File file) {
        this.f9510a = file;
    }

    @Override // d6.i
    public Object a(qd.d<? super h> dVar) {
        return new m(o.d(z.a.d(z.f12027b, this.f9510a, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(xd.k.i(this.f9510a)), a6.d.DISK);
    }
}
