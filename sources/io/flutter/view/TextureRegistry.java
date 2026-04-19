package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public interface TextureRegistry {

    @Keep
    public interface GLTextureConsumer {
        SurfaceTexture getSurfaceTexture();
    }

    @Keep
    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    @Keep
    public interface ImageTextureEntry {
        /* synthetic */ long id();

        void pushImage(Image image);

        /* synthetic */ void release();
    }

    @Keep
    public interface SurfaceProducer {

        public interface a {
            void a();

            void b();
        }

        int getHeight();

        Surface getSurface();

        int getWidth();

        /* synthetic */ long id();

        /* synthetic */ void release();

        void scheduleFrame();

        void setCallback(a aVar);

        void setSize(int i10, int i11);
    }

    @Keep
    public interface SurfaceTextureEntry {
        /* synthetic */ long id();

        /* synthetic */ void release();

        default void setOnFrameConsumedListener(a aVar) {
        }

        default void setOnTrimMemoryListener(b bVar) {
        }

        SurfaceTexture surfaceTexture();
    }

    public interface a {
        void a();
    }

    public interface b {
        void onTrimMemory(int i10);
    }

    ImageTextureEntry a();

    SurfaceProducer b();

    SurfaceTextureEntry c();
}
