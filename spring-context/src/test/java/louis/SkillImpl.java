package louis;

public class SkillImpl implements Skill {


	@Override
	public String getSkill(String skill) {
		System.out.println(skill);
		return skill;
	}
}