package d6;

import a6.o;
import ae.r;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import d6.i;
import hf.u;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f9503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6.m f9504b;

    public static final class a implements i.a<Uri> {
        private final boolean c(Uri uri) {
            return r.b(uri.getScheme(), "content");
        }

        @Override // d6.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, j6.m mVar, x5.e eVar) {
            if (c(uri)) {
                return new e(uri, mVar);
            }
            return null;
        }
    }

    public e(Uri uri, j6.m mVar) {
        this.f9503a = uri;
        this.f9504b = mVar;
    }

    private final Bundle d() {
        k6.c cVarB = this.f9504b.n().b();
        c.a aVar = cVarB instanceof c.a ? (c.a) cVarB : null;
        if (aVar == null) {
            return null;
        }
        int i10 = aVar.f14405a;
        k6.c cVarA = this.f9504b.n().a();
        c.a aVar2 = cVarA instanceof c.a ? (c.a) cVarA : null;
        if (aVar2 == null) {
            return null;
        }
        int i11 = aVar2.f14405a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
        return bundle;
    }

    @Override // d6.i
    public Object a(qd.d<? super h> dVar) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.f9504b.g().getContentResolver();
        if (b(this.f9503a)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f9503a, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f9503a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.f9503a)) {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.f9503a);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f9503a + "'.").toString());
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.f9503a, "image/*", d(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f9503a + "'.").toString());
            }
        }
        return new m(o.b(u.d(u.k(inputStreamOpenInputStream)), this.f9504b.g(), new a6.c(this.f9503a)), contentResolver.getType(this.f9503a), a6.d.DISK);
    }

    public final boolean b(Uri uri) {
        return r.b(uri.getAuthority(), "com.android.contacts") && r.b(uri.getLastPathSegment(), "display_photo");
    }

    public final boolean c(Uri uri) {
        List<String> pathSegments;
        int size;
        return r.b(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && r.b(pathSegments.get(size + (-3)), "audio") && r.b(pathSegments.get(size + (-2)), "albums");
    }
}
