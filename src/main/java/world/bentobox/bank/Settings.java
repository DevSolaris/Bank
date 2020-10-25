package world.bentobox.bank;

import java.util.ArrayList;
import java.util.List;

import world.bentobox.bentobox.api.configuration.ConfigComment;
import world.bentobox.bentobox.api.configuration.ConfigEntry;
import world.bentobox.bentobox.api.configuration.ConfigObject;
import world.bentobox.bentobox.api.configuration.StoreAt;

/**
 * @author tastybento
 *
 */
@StoreAt(filename="config.yml", path="addons/Bank") // Explicitly call out what name this should have.
@ConfigComment("Bank Configuration [version]")
@ConfigComment("")
public class Settings implements ConfigObject {
    // General
    @ConfigComment("BentoBox GameModes that can use Bank")
    @ConfigEntry(path = "bank.game-modes")
    private List<String> gameModes = new ArrayList<>();

    @ConfigComment("User command")
    @ConfigEntry(path = "bank.commands.user")
    private String userCommand = "bank";

    @ConfigComment("Admin command")
    @ConfigEntry(path = "bank.commands.admin")
    private String adminCommand = "bank";

    @ConfigComment("This is how many ranks will be registered with the placeholder API.")
    @ConfigComment("There are two placeholders per rank:")
    @ConfigComment("%Bank_[gamemode]_top_name_1% with island level: %Bank_[gamemode]_top_value_1%")
    @ConfigComment("[gamemode] is bskyblock, acidisland, etc.")
    @ConfigEntry(path = "bank.placeholders.number-of-ranks")
    private int ranksNumber = 10;

    /**
     * @return the gameModes
     */
    public List<String> getGameModes() {
        return gameModes;
    }

    /**
     * @param gameModes the gameModes to set
     */
    public void setGameModes(List<String> gameModes) {
        this.gameModes = gameModes;
    }

    /**
     * @return the userCommand
     */
    public String getUserCommand() {
        return userCommand;
    }

    /**
     * @param userCommand the userCommand to set
     */
    public void setUserCommand(String userCommand) {
        this.userCommand = userCommand;
    }

    /**
     * @return the adminCommand
     */
    public String getAdminCommand() {
        return adminCommand;
    }

    /**
     * @param adminCommand the adminCommand to set
     */
    public void setAdminCommand(String adminCommand) {
        this.adminCommand = adminCommand;
    }

    /**
     * @return the ranksNumber
     */
    public int getRanksNumber() {
        return ranksNumber;
    }

    /**
     * @param ranksNumber the ranksNumber to set
     */
    public void setRanksNumber(int ranksNumber) {
        this.ranksNumber = ranksNumber;
    }


}
