package e7;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodecList f10651a;

    static final class a extends ae.s implements zd.a<List<? extends x>> {
        a() {
            super(0);
        }

        @Override // zd.a
        public final List<? extends x> invoke() {
            return g.this.c();
        }
    }

    public g(MediaCodecList mediaCodecList) {
        ae.r.f(mediaCodecList, "codecList");
        this.f10651a = mediaCodecList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<x> c() {
        MediaCodecInfo[] codecInfos = this.f10651a.getCodecInfos();
        ae.r.e(codecInfos, "codecList.codecInfos");
        ArrayList arrayList = new ArrayList(codecInfos.length);
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            String name = mediaCodecInfo.getName();
            ae.r.e(name, "it.name");
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            ae.r.e(supportedTypes, "it.supportedTypes");
            arrayList.add(new x(name, nd.p.E0(supportedTypes)));
        }
        return arrayList;
    }

    @Override // e7.f
    public List<x> a() {
        return (List) g7.a.a(new a(), nd.u.m());
    }
}
