import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-mis_me_gusta_item')
export class VistaMis_me_gusta_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="" style="width: 100%; height: 100%;">
  <iron-icon style="width: 20%; height: 100%;" src="../../resources/icons/user.svg"></iron-icon>
  <vaadin-horizontal-layout style="height: 100%; width: 80%; align-items: center; justify-content: center;">
   <label>Usuario</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
