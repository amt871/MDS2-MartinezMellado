import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-me_gusta__comercial__item')
export class VistaMe_gusta__comercial__item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; align-items: center;">
 <img style="height: 90%; align-self: center;" src="../../resources/icons/user.svg">
 <vaadin-vertical-layout style="height: 100%; width: 100%; align-items: center; justify-content: center;">
  <label style="align-self: center;">Usuario</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
