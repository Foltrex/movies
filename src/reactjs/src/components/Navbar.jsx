import React from 'react';

import {FontAwesomeIcon} from '@fortawesome/react-fontawesome';

import '../assets/css/Navbar.css'

const Navbar = () => {
    return (
        <nav className='navbar navbar-expand-sm fixed-top justify-content-center shadow-sm mt-2 bg-white'>
            <ul className='navbar-nav'>
                <li className='nav-item'>
                    <a href='#' className='nav-link'>Tests</a>
                </li>
                <li className='nav-item'>
                    <a href='#' className='nav-link'>Films</a>
                </li>
                <li className='nav-item'>
                    <a href='#' className='nav-link'>
                        <span className='logo-text'>Movies</span>
                    </a>
                </li>
                <li className='nav-item'>
                    <a href='#' className='nav-link'>Cartoons</a>
                </li>
                <li className='nav-item'>
                    <a href='#' className='nav-link'>Wiki</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Dropdown link
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
            </ul>
        </nav>
    );
}

export default Navbar;
