package magicjinn.serveruiexample;

import magicjinn.serverui.ServerUIData;
import magicjinn.serverui.mixin.Data.ServerBlock;
import magicjinn.serverui.mixin.Data.ServerBlock.SBlockType;

import java.util.ArrayList;
import magicjinn.BlockEntity.StarProcessor;

public class ServerUIExampleServerUI {
    public ServerUIData handle() {
        ArrayList<ServerBlock> blocks = new ArrayList<>();

        blocks.add(new ServerBlock(SBlockType.STONE_METAL, StarProcessor.class, "star_processor",
                ServerUIExample.NAMESPACE, null));

        return new ServerUIData(blocks); // TEMP
        // Endpoint implementation
    }
}
