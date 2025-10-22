# User Story Template

**Title:**
_As a [user role], I want [feature/goal], so that [reason]._

**Acceptance Criteria:**
1. [Criteria 1]
2. [Criteria 2]
3. [Criteria 3]

**Priority:** [High/Medium/Low]
**Story Points:** [Estimated Effort in Points]
**Notes:**
- [Additional information or edge cases]

# User Stories

---

## Admin User Stories

### Story 1: Admin Login
**Title:** Admin Login  
_As an Admin, I want to log into the portal with my username and password, so that I can manage the platform securely._  

**Acceptance Criteria:**  
1. Admin can enter valid credentials to access the portal.  
2. Invalid credentials show an error message.  
3. Successful login redirects to the Admin dashboard.  

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Passwords must be encrypted.  
- Consider adding MFA later.  

---

### Story 2: Admin Logout
**Title:** Admin Logout  
_As an Admin, I want to log out of the portal, so that I can protect system access._  

**Acceptance Criteria:**  
1. Logout button is available on every page.  
2. Session ends immediately after logout.  
3. User is redirected to login page after logging out.  

**Priority:** High  
**Story Points:** 2  
**Notes:**  
- Auto logout after inactivity can be a related feature.  

---

### Story 3: Admin - Add Doctors
**Title:** Admin - Add Doctors  
_As an Admin, I want to add doctors to the portal, so that they can provide medical services to patients._  

**Acceptance Criteria:**  
1. Admin can enter doctor details (name, specialization, contact, etc.).  
2. System validates required fields.  
3. Doctor profile is created successfully and visible in the system.  

**Priority:** High  
**Story Points:** 5  
**Notes:**  
- Email verification for new doctor accounts may be needed.  

---

### Story 4: Admin - Delete Doctor Profile
**Title:** Admin - Delete Doctor Profile  
_As an Admin, I want to delete a doctor’s profile from the portal, so that I can remove inactive or unauthorized accounts._  

**Acceptance Criteria:**  
1. Admin can search and select a doctor’s profile.  
2. Confirmation prompt before deletion.  
3. Profile is permanently deleted from the system.  

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Consider a "soft delete" option for audit purposes.  

---

### Story 5: Admin - Run Stored Procedure
**Title:** Admin - Run Stored Procedure  
_As an Admin, I want to run a stored procedure in MySQL CLI to get the number of appointments per month, so that I can track usage statistics._  

**Acceptance Criteria:**  
1. Stored procedure returns monthly appointment counts.  
2. Admin can execute it from CLI with proper authentication.  
3. Results are accurate and displayed in a clear format.  

**Priority:** Medium  
**Story Points:** 5  
**Notes:**  
- Later enhancement: integrate stats into dashboard automatically.  

---

## Patient User Stories

### Story 6: Patient - View List of Doctors
**Title:** Patient - View List of Doctors  
_As a Patient, I want to view a list of doctors without logging in, so that I can explore options before registering._  

**Acceptance Criteria:**  
1. Patients can see doctor names, specializations, and availability.  
2. List is accessible without requiring login.  
3. No sensitive contact details are shown until sign-up.  

**Priority:** Medium  
**Story Points:** 3  
**Notes:**  
- Consider adding filters (specialization, location).  

---

### Story 7: Patient - Sign Up
**Title:** Patient - Sign Up  
_As a Patient, I want to sign up using my email and password, so that I can book appointments._  

**Acceptance Criteria:**  
1. Patient can enter email and password to create an account.  
2. Duplicate emails are not allowed.  
3. After sign-up, the patient is redirected to the login page.  

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Passwords must be encrypted.  
- Email verification should be considered.  

---

### Story 8: Patient - Login
**Title:** Patient - Login  
_As a Patient, I want to log into the portal, so that I can manage my bookings._  

**Acceptance Criteria:**  
1. Patients can log in with valid credentials.  
2. Invalid credentials show an error message.  
3. Successful login redirects to the patient dashboard.  

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- Add “Forgot Password” option as future enhancement.  

---

### Story 9: Patient - Logout
**Title:** Patient - Logout  
_As a Patient, I want to log out of the portal, so that I can secure my account._  

**Acceptance Criteria:**  
1. Patient can log out with a single click.  
2. Session ends immediately upon logout.  
3. User is redirected to the login page.  

**Priority:** High  
**Story Points:** 2  
**Notes:**  
- Auto-logout after inactivity could be considered.  

---

### Story 10: Patient - Book Appointment
**Title:** Patient - Book Appointment  
_As a Patient, I want to book an hour-long appointment with a doctor, so that I can consult with them._  

**Acceptance Criteria:**  
1. Patient can select doctor, date, and time.  
2. Appointment duration is fixed at one hour.  
3. Confirmation message is shown after booking.  

**Priority:** High  
**Story Points:** 5  
**Notes:**  
- Prevent double-booking conflicts.  

---

### Story 11: Patient - View Upcoming Appointments
**Title:** Patient - View Upcoming Appointments  
_As a Patient, I want to view my upcoming appointments, so that I can prepare accordingly._  

**Acceptance Criteria:**  
1. Patients can see a list of all scheduled appointments.  
2. Each entry shows doctor, date, and time.  
3. Past appointments are not included in this list.  

**Priority:** Medium  
**Story Points:** 3  
**Notes:**  
- Consider adding reminders/notifications later.  

---

## Doctor User Stories

### Story 12: Doctor - Login
**Title:** Doctor - Login  
_As a Doctor, I want to log into the portal, so that I can manage my appointments._  

**Acceptance Criteria:**  
1. Doctor can log in using valid credentials.  
2. Invalid credentials show an error message.  
3. Successful login redirects to the Doctor dashboard.  

**Priority:** High  
**Story Points:** 3  
**Notes:**  
- MFA can be added for security.  

---

### Story 13: Doctor - Logout
**Title:** Doctor - Logout  
_As a Doctor, I want to log out of the portal, so that I can protect my data._  

**Acceptance Criteria:**  
1. Logout button is accessible from all pages.  
2. Session is ended immediately after logout.  
3. Redirect to login page after logout.  

**Priority:** High  
**Story Points:** 2  
**Notes:**  
- Auto-logout after inactivity can be added.  

---

### Story 14: Doctor - View Appointment Calendar
**Title:** Doctor - View Appointment Calendar  
_As a Doctor, I want to view my appointment calendar, so that I can stay organized._  

**Acceptance Criteria:**  
1. Calendar displays all upcoming appointments.  
2. Past appointments are shown as history.  
3. Appointments are shown with patient name, date, and time.  

**Priority:** High  
**Story Points:** 5  
**Notes:**  
- Consider adding daily/weekly/monthly views.  

---

### Story 15: Doctor - Mark Unavailability
**Title:** Doctor - Mark Unavailability  
_As a Doctor, I want to mark my unavailability, so that patients only see available slots._  

**Acceptance Criteria:**  
1. Doctor can block dates/times in the calendar.  
2. Blocked times are hidden from patient booking.  
3. Changes update in real time.  

**Priority:** High  
**Story Points:** 5  
**Notes:**  
- Could integrate with external calendars (Google, Outlook).  

---

### Story 16: Doctor - Update Profile
**Title:** Doctor - Update Profile  
_As a Doctor, I want to update my profile with specialization and contact information, so that patients have up-to-date information._  

**Acceptance Criteria:**  
1. Doctor can edit specialization, contact info, and bio.  
2. Changes are saved and visible to patients immediately.  
3. Required fields (specialization, contact) must be validated.  

**Priority:** Medium  
**Story Points:** 3  
**Notes:**  
- Consider adding profile picture upload.  

---

### Story 17: Doctor - View Patient Details
**Title:** Doctor - View Patient Details  
_As a Doctor, I want to view the details of my upcoming patients, so that I can be prepared for the appointment._  

**Acceptance Criteria:**  
1. Doctor can access basic patient details (name, age, condition).  
2. Only details for scheduled patients are visible.  
3. Data must follow privacy and security compliance.  

**Priority:** High  
**Story Points:** 5  
**Notes:**  
- Add medical history integration in the future.  

---
