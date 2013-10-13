package net.md_5.bungee.api.event;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.md_5.bungee.api.connection.Connection;
import net.md_5.bungee.api.plugin.Cancellable;

/**
 * Event called when a plugin message is sent to the server by the client.
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PlayerPluginMessageEvent extends TargetedEvent implements Cancellable
{

    /**
     * Cancelled state.
     */
    private boolean cancelled;
    /**
     * Tag specified for this plugin message.
     */
    private final String tag;
    /**
     * Data contained in this plugin message.
     */
    private final byte[] data;

    public PlayerPluginMessageEvent(Connection sender, Connection receiver, String tag, byte[] data)
    {
        super( sender, receiver );
        this.tag = tag;
        this.data = data;
    }
}
