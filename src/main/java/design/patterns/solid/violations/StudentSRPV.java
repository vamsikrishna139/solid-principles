package design.patterns.solid.violations;

public class StudentSRPV {
    private int id;
    private String name;
    private String address;//violation: because address does not belong here, it should be in a separate class.
}
