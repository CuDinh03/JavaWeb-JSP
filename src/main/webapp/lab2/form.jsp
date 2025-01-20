<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form action="/form/update" method="post">
    <div>Fullname:</div>
    <input name="fullname" value="${user.fullname}"><br>
    <div>Gender:</div>
    <input type="radio" name="gender" value="true" ${user.gender ? 'checked' : ''} >
    Male<br>
    <input type="radio" name="gender" value="false" ${user.gender == false ? 'checked': ''}>
    Female<br>
    <div>Country:</div>
    <select name="country">
        <option value="VN" ${user.country == 'VN'? 'selected' : ''}>Việt Nam</option>
        <option value="US" ${user.country == 'US'? 'selected' : ''}>United States</option>
        <option value="CN" ${user.country == 'CN'? 'selected' : ''}>China</option>
    </select>
    <div>Hobbies:</div>
    <label>
        <input type="checkbox" name="hobbies" value="Bơi lội" ${user.hobbies.contains('Bơi lội') ? 'checked' : ''}>
        Bơi lội
    </label><br>
    <label>
        <input type="checkbox" name="hobbies" value="Cầu lông" ${user.hobbies.contains('Cầu lông') ? 'checked' : ''}>
        Cầu lông
    </label><br>
    <label>
        <input type="checkbox" name="hobbies" value="Bóng đá" ${user.hobbies.contains('Bóng đá') ? 'checked' : ''}>
        Bóng đá
    </label><br>
    <label>
        <input type="checkbox" name="hobbies" value="Đọc sách" ${user.hobbies.contains('Đọc sách') ? 'checked' : ''}>
        Đọc sách
    </label><br>
    <label>
        <input type="checkbox" name="hobbies" value="Nghe nhạc" ${user.hobbies.contains('Nghe nhạc') ? 'checked' : ''}>
        Nghe nhạc
    </label><br>

    <hr>
    <button ${editabled == true ? 'disabled' : '' } >Create</button>
    <button>Update</button>
</form>

<table>
    <tr>
        <th>Fullname</th>
        <th>Gender</th>
        <th>Country</th>
        <th>Hobbies</th>
    </tr>
    <tr>
        <td>${user2.fullname}</td>
        <td>${user2.gender ? 'Nam':'Nữ'}</td>
        <td>${user2.country}</td>
        <td>${user2.hobbies}</td>
    </tr>
</table>