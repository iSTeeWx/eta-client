import java.io.File;
import java.util.Arrays;

import net.minecraft.client.main.Main;
import org.apache.commons.lang3.ArrayUtils;

public class Start {
    public static void main(String[] args) {
        System.setProperty("org.lwjgl.librarypath", new File("versions/1.8.9/1.8.9-natives").getAbsolutePath());
        Main.main(ArrayUtils.addAll(new String[]{"--version", "1.8.9", "--accessToken", "0", "--assetsDir", "assets", "--assetIndex", "1.8", "--userProperties", "{}"}, args));
    }
}